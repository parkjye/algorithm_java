package quest.main;

import java.util.Stack;

public class Day1102 {
	/* 짝지어 제거하기 */
	public static int solution(String s) {
		int answer=0;		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
				
			}else if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
				stack.pop();
				continue;
			}
		}
		
		if(stack.isEmpty()) answer = 1;
		
		return answer;
	}

	public static void main(String[] args) {
		String s = "cdcd";
		System.out.println(solution(s));
	}
}
