package quest.main;

public class Date21_0130 {
	/* 숫자의 표현 */
	public static void main(String[] args) {
		Date21_0130 makeTheNum = new Date21_0130();
		
		int n = 15;
		System.out.println(makeTheNum.solution(n));
	}
	
	public int solution(int n) {
		int answer = 0;
		int getSum;

		for(int i=1; i<=n; i++) {
			getSum = 0;
			
			for(int j=i; j<=n; j++) {
				getSum += j;
				
				if(getSum==n) {
					answer++;
					break;
					
				}else if (getSum > n) break;
			}
		}

		return answer;
	}
	
}
