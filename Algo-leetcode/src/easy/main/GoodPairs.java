package easy.main;

public class GoodPairs {

	/* 1512. Number of Good Pairs */
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1, 1, 3};
		
		GoodPairs pairs = new GoodPairs();
		System.out.println(pairs.numIdenticalPairs(nums));
		
	}
	
	public int numIdenticalPairs(int[] nums) {
		
		int output = 0;
        for(int i=0; i<nums.length; i++){
        	
            for(int j=i+1; j<nums.length; j++){
            	
                if(nums[i] == nums[j]) output++;
            }
        }
		
		return output;
	}

}
