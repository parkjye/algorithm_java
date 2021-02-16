package quest.main;

public class Date21_0216 {
	/* 올바른 괄호 */
	public static void main(String[] args) {
		Date21_0216 rightBracket = new Date21_0216();
		
		String s = "(())()";
		System.out.println(rightBracket.solution(s));

	}
	
	public boolean solution(String s) {
		boolean answer = true;
		int cntOpen = 0;
		
		if(s.charAt(0) == ')') return false;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == '(') cntOpen++;
			else {
				if(cntOpen <= 0) return false;
				
				cntOpen--;
			}
		}
		
		if(cntOpen != 0) return false;
		
		return answer;
	}

}
