package quest.main;

public class Date21_0108 {
	/* 멀쩡한 사각형 */
	public static void main(String[] args) {
		Date21_0108 usefulSquare = new Date21_0108();
		
		int w = 8, h = 12;
		System.out.println(usefulSquare.solution(w, h));
	}
	
	public long solution(int w, int h) {
		long answer = 1;
		
		long longW = (long)w;
		long longH = (long)h;
		long square = longW * longH;
		
		long brokenSq = (longW+longH)- gcd(w, h);
		answer = square - brokenSq;

		return answer;
	}
	
	public static long gcd (long w, long h) {
		long euclideanNum = 0;
		long temp = 0;
		
		long maxNum = Math.max(w, h);
		long minNum = Math.min(w, h);
		
		while(minNum > 0) {
			temp = maxNum;
			maxNum = minNum;
			minNum = temp % minNum;
		}

		euclideanNum = maxNum;
		
		return euclideanNum;
	}

}
