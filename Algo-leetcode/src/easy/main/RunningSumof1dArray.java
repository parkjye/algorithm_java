package easy.main;

public class RunningSumof1dArray {
	/* 1480. Running Sum of 1d Array */
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		RunningSumof1dArray running = new RunningSumof1dArray();
		System.out.println(running.runningSum(nums));
	}
	
	public int[] runningSum(int[] nums) {
		int[] answer = new int[nums.length];
        int tmp = 0;
        
        for(int i=0; i<nums.length; i++) {
            tmp +=  nums[i];
            answer[i] = tmp;
        }

        return answer;
	}

}
