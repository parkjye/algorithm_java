package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Day0922 {	
	public static void main(String[] args) {
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		//Arrays.toString()를 사용해서 배열 값 출력
	    //toString을 사용하지 않으면 배열의 참조값이 출력된다.
		System.out.println(Arrays.toString(solution(arr, divisor)));
		
		}
		
		//나누어 떨어지는 숫자 배열
		public static int[] solution(int[] arr, int divisor) {
	    
			int[] answer = {};
		    ArrayList<Integer> getArr = new ArrayList<Integer>();
		    
		    
		    if(arr.length < 1) {
		    	return answer;
		    }
		    
		    //divisor로 나누어 떨어지는 값은 getArr에 넣어준다.
		    for(int i=0; i<arr.length; i++) {
				if(arr[i] % divisor == 0) {
					getArr.add(arr[i]);
				}
			}
		    
		    //arr중에 divisor로 나누어 떨어지는 값이 하나도 없으면 getArr에 -1를 넣어준다.
		    if(getArr.isEmpty()) {
		    	getArr.add(-1);
		    }
		    
		    //getArr 크기만큼 초기화
		    answer = new int[getArr.size()];
		    
		    //answer에 getArr값을 넣어준다.
		    for(int i=0; i<getArr.size(); i++ ) {
		    	answer[i]=getArr.get(i);
		    }
		    
		    //오름차순
		    Arrays.sort(answer);

	        return answer;
		    
		}

}//Day0922