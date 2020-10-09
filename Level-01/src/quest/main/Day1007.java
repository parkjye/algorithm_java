package quest.main;

public class Day1007 {
	
	/* 평균 구하기 */
	public static double solution(int[] arr) {
        double answer = 0;
        double temp = 0;
        
        for(int i=0; i<arr.length; i++) {
        	temp += arr[i];
        }
        
        answer = temp / arr.length;
        
        return answer;
    }
	
	/* Condition */
	public static boolean isValid(int[] arr) {
		boolean flag=false;
		
		if(arr.length >= 1 || arr.length<=100) flag=true;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= -10000 || arr[i] <= 1000) flag=true;
		}
		
		return flag;
	} 

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 10000};
		if(isValid(arr)) System.out.println(solution(arr));
	}
}
