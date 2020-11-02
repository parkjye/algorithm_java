package quest.main;

import java.util.Stack;

public class Day1102 {
	/* 짝지어 제거하기 */
	public int solution(String s) {
		int answer=0;		
		Stack<Character> stack = new Stack<Character>();
		
		if (s.length() % 2 != 0) {
			return answer;
			
		}else {
			for(int i=0; i<s.length(); i++) {
				
				if(stack.isEmpty()) stack.push(s.charAt(i));
				else if(!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
				else stack.add(s.charAt(i));
			}
			
			if(stack.isEmpty()) answer = 1;
		}
		
		return answer;
	}
	
	public static boolean isValid(String s) {
		boolean flag=false;
		
		if(s.length()<=1000000) {
			for(int i=0; i<s.length(); i++) {
				if(Character.isLowerCase(s.charAt(i))) flag=true;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		String s = "baabaa";
		
		Day1102 Solution = new Day1102();

		if(isValid(s)) {
			System.out.println(Solution.solution(s));
		}
	}
}
