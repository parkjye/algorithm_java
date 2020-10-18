package quest.main;

import java.util.Arrays;
import java.util.Collections;

public class Day1019 {
	
	/* 정수 내림차순으로 배치하기 */
	public static long solution(long n) {
        long answer = 0;
        String resultStr = "";

        String[] getWords = Long.toString(n).split("");
		
		//Collections을 사용할 때는 참조타입 사용
		Arrays.sort(getWords, Collections.reverseOrder());
		
		for(int i=0; i<getWords.length; i++) {
			resultStr += getWords[i];
		}
		
		answer = Long.parseLong(resultStr);

        return answer;
    }

	public static boolean isValid(long n) {
		boolean flag=false;
		if(n>=1 && n<=8000000000L) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		long n = 118372;
		
		/**/
		if(isValid(n)) {
			System.out.println(solution(n));
		}
	}
}
