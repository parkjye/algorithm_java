package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Day1228 {
	/* 두 개 뽑아서 더하기 */
	public int[] solution(int[] numbers) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(numbers.length <= 2 && numbers.length >= 100) {
			return answer;
			
		}else {
			for(int i=0; i<numbers.length; i++) {
				
				int jdx = i+1;
				while(jdx < numbers.length) {
					int sum = numbers[i] + numbers[jdx];
					if(list.indexOf(sum) == -1) list.add(sum);
					jdx++;
				}
			}
			
			answer = new int[list.size()];
			
			for(int j=0; j<list.size(); j++) answer[j] = list.get(j);
			
			Arrays.sort(answer);
			
		}
		return answer;
	}
	
	public static boolean isValid(int[] numbers) {
		boolean flag = false;
		
		for(int i : numbers) {
			if(numbers[i] >= 0 && numbers[i] <= 100) flag = true;
		}
			
		return flag;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		Day1228 sumTwoNum = new Day1228();
		
		if(isValid(numbers)) {
			System.out.println(sumTwoNum.solution(numbers));
		}
	}

}
