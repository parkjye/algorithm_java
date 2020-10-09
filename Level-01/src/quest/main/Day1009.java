package quest.main;

import java.util.Scanner;

public class Day1009 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int n = scan.nextInt();
		scan.close();
		
		if(isValid(n)) {
			System.out.println(solution(n));
		}
	}
	
	/* 약수의 합 */
	public static int solution(int n) {
		int answer = 0;
        
        for(int i=1; i<=n; i++) {
	    	if(n%i==0) answer += i;
        }

        return answer;
    }
	
	/* condition */
	public static boolean isValid(int n) {
		boolean flag=false;
		if(n<=3000) flag=true;
		return flag;
	}
	
}
