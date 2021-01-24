package quest.main;

public class Date21_0125 {
	/* 평균 구하기 */
	public static void main(String[] args) {
		Date21_0125 getAvg = new Date21_0125();
		int[] arr = {1, 2, 3, 4};
		
		System.out.println(getAvg.solution(arr));
	}
	
	public double solution(int[] arr) {
		double answer = 0;
		double tmp = 0;
		
		if(arr.length >= 100) {
			return answer;
			
		}else {
			for(int i : arr) answer = (tmp+=i) / arr.length;
			
		}

		return answer;
	}

}
