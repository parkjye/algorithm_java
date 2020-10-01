package quest.main;

import java.util.Scanner;

public class Day1002_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println(solution(num));
	}
	
	/* 짝수와 홀수 */
	public static String solution(int num) {
		String answer = "";
	    
	    if(num%2==0){ 
	        answer="Even";
	    }else { 
	        answer="Odd"; 
	    }
	    
	    return answer;
	}
}//Day1002_02
