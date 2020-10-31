package quest.main;

public class Day1031_1 {	
	public static long solution(int a, int b) {
        long answer = 0;

        int maxNum = Math.max(a, b);
        int minNum = Math.min(a, b);

        for(int i=minNum; i<=maxNum; i++) {
            answer += i;
        }

        return answer;
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=5;
		
		System.out.println(solution(a, b));
	}
}
