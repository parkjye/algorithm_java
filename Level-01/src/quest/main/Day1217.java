package quest.main;

import java.util.Arrays;

public class Day1217 {
	/* K번째수 */
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int k = commands[i][2];
			
			//ArrayIndexOutOfBoundsException
			int[] tmp = new int[end - start + 1];
			
			int idx = 0;
			for(int j=start-1; j<end; j++) {
				tmp[idx] = array[j];
				idx++;
			}
			
			Arrays.sort(tmp);
			answer[i] = tmp[k-1];
		}

		return answer;
	}

	public static void main(String[] args) {
		Day1217 kth = new Day1217();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(kth.solution(array, commands));
	}

}
