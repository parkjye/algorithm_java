package quest.main;

public class Day1007 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(solution(arr));
		
	}
	
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
	
}
