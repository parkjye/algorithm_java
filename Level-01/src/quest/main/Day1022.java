package quest.main;

import java.util.Arrays;

public class Day1022 {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++) {
			
			//입력받은 배열을 2진수로 변경
			String secretMap = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			//replace()를 사용해서 1은 #, 0은 공백으로 변경
			secretMap = secretMap.replace("1", "#");
			secretMap = secretMap.replace("0", " ");
			
			answer[i] = secretMap;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {9, 20, 28, 18, 11};
		int[] arr2 = new int[] {30, 1, 21, 17, 28};
		int n = 5;
		
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}
}
