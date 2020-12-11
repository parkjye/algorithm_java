package quest.main;

public class Day1211 {
	/* 피보나치 수 */
	public int solution(int n) {
		int answer = 0;		
		int num1 = 0;
		int num2 = 1;
		
		for(int i=2; i<=n; i++) {
			answer = (num1+num2)%1234567;
			num1 = num2;
			num2 = answer;
		}
		
		return answer;
	}
	
	public static boolean isValid(int n) {
		boolean flag=false;
		if(n>=1 && n<=100000) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int n = 3;
		
		Day1211 fibonacci = new Day1211();
		
		if(isValid(n)) {
			System.out.println(fibonacci.solution(n));
		}
	}

}
