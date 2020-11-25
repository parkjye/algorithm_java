package quest.main;

import java.util.Arrays;

public class Day1126 {
	/* 행렬의 덧셈 */
	public int[][] solution(int[][] arr1, int[][]arr2){
		/* 다른 사람의 풀이
		int row = Math.max(arr1.length, arr2.length);
	    int col = Math.max(arr1[0].length, arr2[0].length);
	    
	    int[][] answer = new int[row][col]; */
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}
	
	public static boolean isValid(int[][] arr1, int[][] arr2) {
		boolean flag=false;
        if(arr1.length <= 500 && arr2.length <= 500) flag=true;
        return flag;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};
		
		Day1126 sumMatrix = new Day1126();
		
		if(isValid(arr1, arr2)) System.out.println(Arrays.deepToString(sumMatrix.solution(arr1, arr2)));
	}
}
