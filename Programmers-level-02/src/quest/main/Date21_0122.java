package quest.main;

import java.util.Arrays;

public class Date21_0122 {
	/*최솟값 만들기*/
	public static void main(String[] args) {
		Date21_0122 mininum = new Date21_0122();
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		System.out.println(mininum.solution(A, B));
	}
	
	public int solution(int[] A, int[] B) {
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int j = A.length-1;
		for(int i=0; i<A.length; i++) answer += A[i] * B[j--];
		
		return answer;
	}
	
}
