package quest.main;

public class Day1204 {
	/* 124 나라의 숫자 */
	public String solution(int n) {
		
		/* 
		 * String은 효율성이 떨어져서 String Buffer를 사용.
		 * 
		 * 몫을 3으로 나눠서 나머지를 sbrBuffer에 append한다.
		 * 단, 나머지가 0이면 4로(124 나라에서는 3이 없기 때문)하고 n에서 1을 빼야한다.
		 * 
		 * Ex. 
		 * 6/3 = 2
		 * (2-1) % 3 = 1
		 * 6%3 = 0 -> 4
		 *  */
		StringBuffer strBuffer = new StringBuffer();
		
		int[] arr = {4, 1, 2};
		int remainder = 0;
		
		while(n>0) {
			remainder = n%3;
			n = n/3;
			
			if(remainder == 0) 
				n -= 1;

			strBuffer.append(arr[remainder]);
		}
		
		return strBuffer.reverse().toString();
	}
	
	public static boolean isValid(int n) {
		boolean flag=false;
		if(n <= 500000000) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int n = 6;
		
		Day1204 nara124 = new Day1204();
		
		if(isValid(n))
			System.out.println(nara124.solution(n));
	}
}
