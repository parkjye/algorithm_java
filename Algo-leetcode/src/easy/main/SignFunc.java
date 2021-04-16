package easy.main;

public class SignFunc {
	/* 1822. Sign of the Product of an Array */
	public static void main(String[] args) {
		int[] nums = {1, 5, -2, -3, 0};
		
		SignFunc sign = new SignFunc();
		System.out.println(sign.arraySign(nums));
		
	}
	
	public int arraySign(int[] nums) {
		int output = 0;
		int isOdd = 0;
		
		for(int i : nums) {

			if(i == 0) {
				output = 0;
				return output;
				
			} else if(i < 0) isOdd++;
			
		}
		
		if(isOdd % 2 != 0) output = -1;
		else output = 1;

		return output;
	}

}
