package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Day0922 {	
	public static void main(String[] args) {
		
		
		}
	
	 public static class Solution {
		public int[] solution(int[] arr, int divisor) {
	    
		int[] answer = {};
	    ArrayList<Integer> getArr = new ArrayList<Integer>();
	    
	    for(int i=0; i<arr.length; i++) {
	    	
			if(arr[i] % divisor == 0) {
				getArr.add(arr[i]);
			}
		}
	    
	    if(getArr.isEmpty()) {
	    	getArr.add(-1);
	    }
	    
	    Arrays.sort(answer);
        
        return answer;
		    }
		}

}//Day0922