package easy.main;

import java.util.ArrayList;
import java.util.Arrays;

public class HowManyNumbers {
	/* 1365. How Many Numbers Are Smaller Than the Current Number */
	public static void main(String[] args) {
		int[] nums = {6, 5, 4, 8, 7, 7};
		
		HowManyNumbers smallerNumbers = new HowManyNumbers();
		System.out.println(Arrays.toString(smallerNumbers.smallerNumbersThanCurrent(nums)));
		
	}
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] output = new int[nums.length];
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) list.add(nums[i]);

		for(int i=0; i<nums.length; i++) {
			
			int cnt = 0;
			for(int j=0; j<list.size(); j++) {
				
				if(nums[i] > list.get(j)) cnt++;
			}
			
			output[i] = cnt;
		}

		return output;
	}

}
