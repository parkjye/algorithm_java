package quest.main;

public class Day1023 {
	/* 콜라츠 추측  */
	public static int solution(double num) {
		int answer=0;
		
		for(int i=0; i<=500; i++) {
			if(num==1) break;
			
			if(i==500) answer=-1;
			
			num = (0==num%2) ? num/2 : num*3+1;
			answer++;			
		}

		return answer;
	}
	
	/* condition */
	public static boolean isValid(int num) {
		boolean flag=false;
		if(num>=1 && num<8000000) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int num = 626331;
		if(isValid(num)) System.out.println(solution(num));
	}
}
