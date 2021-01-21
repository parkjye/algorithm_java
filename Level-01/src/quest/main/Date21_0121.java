package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Date21_0121 {
	/* 같은 숫자는 싫어 */	
	public static void main(String[] args) {
		Date21_0121 onlyOne = new Date21_0121();
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		if(isValid(arr)) System.out.println(Arrays.toString(onlyOne.solution(arr)));
	}
	
	public static boolean isValid(int[] arr) {
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 0 && arr[i] <= 9) flag=true;
		}
		
		return flag;
	}
	
	public int[] solution(int []arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int tmp = arr[0];
		list.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(tmp == arr[i]) continue; 
			else{
				tmp = arr[i];
				list.add(tmp);
			}
		}
		
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}

}
