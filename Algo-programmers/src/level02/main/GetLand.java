package level02.main;

import java.util.Arrays;

public class GetLand {
	/* 땅따먹기 */
	public static void main(String[] args) {
		GetLand getLand = new GetLand();
		int[][] land = {{1, 2, 3, 5}, 
						{5, 6, 7, 8}, 
						{4, 3, 2, 1}};
		
		System.out.println(getLand.solution(land));

	}
	
	public int solution(int[][] land) {
		
		for(int i=1; i<land.length; i++) {
			
			land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
			land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
			land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
			land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
		}
		
		int[] answer = land[land.length-1];
		Arrays.sort(answer);
		
		return answer[answer.length-1];
	}

}
