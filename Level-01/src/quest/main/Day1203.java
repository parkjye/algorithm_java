package quest.main;

import java.util.ArrayList;

public class Day1203 {
	/*제일 작은 수 제거하기*/
	public int[] solution(int[] arr) {

		int[] answer= {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		/* condition */
		if(arr.length <= 1 ) {
			arr[0] = -1;
			return arr;
			
		}else {
			
			for(int i : arr) list.add(i);
			
			int getMin = list.get(0);
			
			for(int i=0; i<list.size(); i++) {
				getMin = Math.min(getMin, list.get(i));
			}
			
			list.remove(list.indexOf(getMin));
			
			answer = new int[list.size()];
			
			for(int i=0; i<list.size(); i++) answer[i] = list.get(i);

		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		
		Day1203 removeMinNum = new Day1203();
		
		System.out.println(removeMinNum.solution(arr));
	}
}
