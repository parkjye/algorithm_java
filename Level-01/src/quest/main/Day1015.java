package quest.main;

public class Day1015 {
	
	/* condition */
	public static boolean isValid(long n) {
		boolean flag = false;
		if(n>=1 && n<=50000000000000L) flag=true;
		return flag;
	}
	
	/* 정수 제곱근 판별 */
	public static long solution(long n) {
        long answer = 0;
        double root = 0;
        
        //n의 제곱근
        root = (double)Math.sqrt(n);
        
        if((root*10)%10==0) {
        	answer = (long)Math.pow(root+1, 2);
        }else {
        	answer = -1;
        }

        return answer;
    }
	
	/* solution2 
	public static long solution2(long n) {
        long answer = 0;
        double root = 0;
        int point = 0;

        //n의 제곱근
        root = (double)Math.sqrt(n);

        //소수점 첫 번째 자리
        point = (int)(root*10)%10;

        if(point==0) {
        	answer = (long)Math.pow(root+1, 2);
        }else {
        	answer = -1;
        }

        return answer;
    }*/
	
	public static void main(String[] args) {
		long n = 121;
		
		if(isValid(n)) {
			System.out.println(solution(n));
		}
		
	}
}
