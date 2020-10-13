package quest.main;

import java.util.ArrayList;

public class Day1013 {
	
	/* condition */
	public static boolean isValid(int n){
        boolean flag=false;
        if(n>=1 || n<=100000000) flag=true;
        return flag;
    }
	
	/* 3진법 뒤집기 */
	public static void main(String[] args) {

		int answer = 0;
		int n = 125;

		//몫, 나머지
		int quotient = 0;
		int remainder = 0;

		//3진법 담을 문자열
		String getBase3 = "";

		ArrayList<Integer> list = new ArrayList<Integer>();

		if(isValid(n)) {
			while(n>0) {
				
				//입력받은 정수를 3으로 누고 몫과 나머지를 각각 저장한다.
				quotient = n/3;
				remainder = n%3;

				//정수 값을 몫으로 변경
				n = quotient;

				//나머지는 list에 넣어준다.
				list.add(remainder);
			}

			//list에 저장한 값을 전체 조회한다.
			for(int getInt : list) {
				getBase3 += getInt;
			}

			//parseInt(String, 진법)를 활용해서 10진법으로 변경한다.
			answer = Integer.parseInt(getBase3, 3);
			System.out.println(answer);
			
		}else {
			System.out.println("n은 1이상 100,000,000이하");
		}

	}
	
}
