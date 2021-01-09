package quest.main;

public class Day0926 {
	/* 시저암호 */
	public static void main(String[] args) {
		Day0926 caesar = new Day0926();
		
		String s = "a B z";
		int n = 4;
		System.out.println(caesar.solution(s, n));
	}
	
	public String solution(String s, int n) {
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			char getCh = s.charAt(i);
			
			if(getCh >= 'a' && getCh <= 'z') {
				getCh = (char) (getCh+n);
				
				if(getCh > 'z') getCh -= 26;
			} else if(getCh >= 'A' && getCh <= 'Z') {
				getCh = (char) (getCh+n);
				
				if(getCh > 'Z') getCh -= 26; 
			}
			
			answer += getCh;
		}

		return answer;
	}
	
}
