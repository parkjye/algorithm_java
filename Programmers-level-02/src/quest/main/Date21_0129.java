package quest.main;

public class Date21_0129 {
	/* 소수 만들기 */
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		Date21_0129 getPrimeNum= new Date21_0129();
		System.out.println(getPrimeNum.solution(nums));
	}
	
	public int solution(int[] nums) {
		int answer = -1;
		
		if(nums.length <= 2) {
			return answer;
		}else {
			
			int getSum = 0;
			
			for(int i=0; i<nums.length; i++) {
				for(int j=i+1; j<nums.length; j++) {
					for(int k=j+1; k<nums.length; k++) {
						
						getSum = nums[i]+nums[j]+nums[k];
						if(!isPrime(getSum)) answer++;
					}
				}
			}		
		}
		
		return answer;
	}
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		
		if(n==2) return flag;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		
		return flag;
	}

}
