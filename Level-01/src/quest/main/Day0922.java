package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Day0922 {
	
	/* 나누어 떨어지는 숫자 배열 */
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor ==0) list.add(arr[i]);
		}
		
		if(list.isEmpty()) {
			list.add(-1);
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		/*
		 * Arrays.toString()를 사용해서 배열 값 출력
		 * toString을 사용하지 않으면 배열의 참조값이 출력된다.
		 * */
		System.out.println(Arrays.toString(solution(arr, divisor)));
		
		}
}