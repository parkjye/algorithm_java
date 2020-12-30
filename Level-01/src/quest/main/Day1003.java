package quest.main;

public class Day1003 {
	/* 자릿수 더하기 */
	public static void main(String[] args) {
		Day1003 addNum = new Day1003();
		int n = 123;
		
		if(isValid(n)) System.out.println(solution(n));
		if(isValid(n)) System.out.println(addNum.solution2(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
    	while(n!=0) {
    		answer += n%10;
    		n /= 10;
    	}
    	
        return answer;
    }
	
	public int solution2(int n) {
		int answer = 0;
		String[] getSum = Integer.toString(n).split("");
		
		for(int i=0; i<getSum.length; i++) {
			answer += Integer.parseInt(getSum[i]);
		}
		
		return answer;
	}
	
    public static boolean isValid(int n) {
		boolean flag=false;
		if(n <= 100000000) flag=true;
		return flag;
	}
	
}
