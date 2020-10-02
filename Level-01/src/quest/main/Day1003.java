package quest.main;

import java.util.Scanner;

public class Day1003 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int n = scan.nextInt();
		scan.close();
		
		if(isValid(n)) {
			System.out.println(solution(n));
		}
		
	}
	
	/* 자릿수 더하기 */
	public static int solution(int n) {
        int answer = 0;

        //입력받은 정수를 10으로 나눈 나머지를 계속 더해준다.
        //n을 10으로 나눈 값을 다시 n에 넣어준다.
    	while(n!=0) {
    		answer += n%10;
    		n /= 10;
    	}
    	
        return answer;
    }
	
    public static boolean isValid(int n) {
		boolean flag=false;
		if(n <= 100000000) flag=true;
		return flag;
	}
	
}//Day1003
