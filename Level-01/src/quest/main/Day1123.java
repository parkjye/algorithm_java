package quest.main;

public class Day1123 {
	/* 수박수박수박수박수박수? */
	public String solution(int n) {
		String answer = "";
		
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) answer += "수";
			else answer += "박";
		}
		
		return answer;
	}
	
	public String solution2(int n) {
		String answer = "";
		
		for(int i=1; i<=n; i++) answer += i%2!=0 ? "수" : "박";
		
		return answer;
	}
	
	/* condition */
	public static boolean isValid(int n) {
		boolean flag=false;
		if(n<=10000) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int n = 4;
		
		Day1123 subaksu = new Day1123();
		if(isValid(n)) System.out.println(subaksu.solution(n));
	}
}
