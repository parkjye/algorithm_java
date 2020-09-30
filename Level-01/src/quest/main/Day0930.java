package quest.main;

import java.util.Scanner;

public class Day0930 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요");
		int a = scan.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
		int b = scan.nextInt();
		
		scan.close();
		
		//
		if(isValid(a, b)) {
			System.out.println(solution(a, b));
		}
		
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        
        //입력받은 두 정수의 대소 관계를 비교한다.
        if(a<b) {
        	for(int i=a; i<=b; i++) {
        		answer += i;
        	}	
        }else {
        	for(int i=b; i<=a; i++) {
        		answer += i;
        	}
        }

        return answer;
    }
	
	//-10,000,000 이상 10,000,000 이하
	public static boolean isValid(int a, int b) {
		boolean flag = false;
		
		if((a >= -10000000 && a <= 10000000) && (b >= -10000000 && b <= 10000000)) {
			flag=true;
		}
		
		return flag;
		
	}
	
}//Day0930
