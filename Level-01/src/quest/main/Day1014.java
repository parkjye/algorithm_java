package quest.main;

public class Day1014 {
	
	/* condition
	 * 
	 * 정수형 상수는 int형으로 표현되기 때문에
	 * 10000000000만 명시하면 안됨.
	 * 10000000000L or l을 사용해서 명시적 선언
	 *  */ 
	public static boolean isValid(long n) {
		boolean flag=false;
		if(n <= 10000000000L) flag=true;
		return flag;
	}
	
	/* 자연수 뒤집어 배열로 만들기 */
	public static int[] solution(long n) {
		
		//입력받은 n을 String으로 반환해서 answer크기 선언
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			answer[i] += n%10;
			n /= 10;
		}

        return answer;
    }
	
	public static void main(String[] args) {
		long n = 12345;

		if(isValid(n)) {
			System.out.println(solution(n));
		}
	}
}
