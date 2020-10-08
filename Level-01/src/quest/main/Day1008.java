package quest.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Day1008 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = scan.nextInt();
		scan.close();
		
		//
		if(isValid(n)) {
			System.out.println(solution(n));
		}
	}
	
	
	/* 10진법 -> 3진법 -> 10진법 */
	public static int solution(int n) {
		
		int answer = 0;
		
		//나머지 담을 list
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//(변경될)몫을 담을 변수
		int quotient = 0;

		//3진법 전체 조회할 문자열
		String getBase3 = "";

		while(n>0) {
			//입력받은 정수를 3으로 나누고 나머지는 몫과 나머지를 각각 담는다. 
			quotient = n/3;
			list.add(n%3);
			
			//몫을 변경해준다.
			n = quotient;
		}
		
		//list에 저장된 나머지 값을 전체 조회한다.
		for(int getInt : list) {
			getBase3 += getInt;
		}
		
		//parseInt(String, 진법)를 활용해서 10진법으로 변경한다.
		answer = Integer.parseInt(getBase3, 3);

		return answer;	
	}
	
	/* condition */
	public static boolean isValid(int n){
        boolean flag=false;
        if(n>=1 || n<=100000000) flag=true;
        return flag;
    }
}
