package quest.main;

public class Day1224 {
	/* 내적 */
	public int solution(int[] a, int[] b) {
		int answer = 0;

        for(int i=0; i<a.length; i++) answer += (a[i]*b[i]);

        return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		Day1224 product = new Day1224();
		System.out.println(product.solution(a, b));
	}

}
