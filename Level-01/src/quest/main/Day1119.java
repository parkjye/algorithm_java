package quest.main;

public class Day1119 {
	/* 2016년 */
	public String solution(int a, int b) {
		String answer = "";
		int sum = 0;
		
		String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=1; i<a; i++) {
			if(i==4 || i==6 || i==9 || i==11) sum += 30; 
			else if(i==2) sum += 29;
			else sum += 31;
		}
		
		sum += b+4;
		answer = weeks[sum%7];
		
		return answer;
	}
	
	public static boolean isValid(int a, int b) {
		boolean flag=false;
		
		if(a>=1 && a<=12) {
			if(b>=1 && b<=31) flag=true;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		Day1119 cal2016 = new Day1119();
		System.out.println(cal2016.solution(a, b));
	}
}
