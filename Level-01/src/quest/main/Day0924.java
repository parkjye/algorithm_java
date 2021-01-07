package quest.main;

public class Day0924 {
	/* 소수 찾기(에라토스테네스의 체) */
	public static void main(String[] args) {
		int n = 10;
		solution(n);
	}
	
	public static int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n+1];
        
        for(int i=2; i<=n; i++) numbers[i]=i;

        for(int i=2; i<n; i++) {
        	if(numbers[i]==0) continue;
        	
        	for(int j=2*i; j<=n; j+=i) numbers[j] = 0;
        }
        
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i]!=0) answer++;
        }
        
        return answer;
    }
}
