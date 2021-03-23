package easy.main;

import java.util.Arrays;

public class ShuffletheArray {

	/* 1470. Shuffle the Array */
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		
		ShuffletheArray solution = new ShuffletheArray();
		System.out.println(Arrays.toString(solution.shuffle(nums, n)));
	}
	
	public int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        
        int idx = 0;
        for(int i=0; i<n; i++) {
        	output[idx] = nums[i];
        	idx+=2;
        }
        
        int idx2 = 1;
        for(int i=n; i<nums.length; i++) {
        	output[idx2] = nums[i];
        	idx2 += 2;
        }
        
        return output;
    }
}
