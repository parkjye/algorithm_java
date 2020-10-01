package quest.main;

import java.util.Scanner;

public class Day1002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x값 입력");
		int x = scan.nextInt();
		
		System.out.println("n값 입력");
		int n = scan.nextInt();
		
		scan.close();

		//
		if(isValid(x, n)) {
			System.out.println(solution(x, n));
		}
		
	}
	
	/* x만큼 간격이 있는 n개의 숫자 */
	public static long[] solution(int x, int n) {
		//입력받은 n값을 배열의 크기로 선언
		long[] answer = new long[n];
		
		//x값을 증가시켜서 저장할 변수 선언
		long tmp=0;
		
		for(int i=0; i<n; i++) {
			tmp += x;
			answer[i] += tmp;
		}
		
		return answer;
	}
	
	/* condition */
	public static boolean isValid(int x, int n) {
		boolean flag=false;
		if((x >= -10000000 && x <= 10000000) && (n <= 1000)) flag=true;
		return flag;
	}
 
}//Day1002
