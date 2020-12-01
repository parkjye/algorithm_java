package quest.main;

public class Day1201 {
	
	/* 다음 큰 숫자 */
	public int solution(int n) {
		int answer = 0;
		int getBit = Integer.bitCount(n);
		
		while(true) {
			n++;
			
			int tmepBit = Integer.bitCount(n);
			
			if(getBit == tmepBit) {
				answer = n;
				break;
			}
		}
		
		return answer;
	}
	
	/* 제한조건 */
	public static boolean isValid(int n) {
		boolean flag=false;
		if(n>=1 && n<=1000000) flag=true;
		
		return flag;
	}
	
	public static void main(String[] args) {
		int n1 = 78;
		
		Day1201 nextNum = new Day1201();
		
		if(isValid(n1)) {
			System.out.println(nextNum.solution(n1));
		}
		
	}
}
