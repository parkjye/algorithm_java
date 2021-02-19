package level02.main;

public class FindPrimeNumber {
	/* 소수찾기 */
	public static void main(String[] args) {
		FindPrimeNumber prime = new FindPrimeNumber();
		
		int n = 10;
		System.out.println(prime.solution(n));
		System.out.println(prime.solution2(n));
	}

	/* 에라토스테네스의 체 */
	public int solution(int n) {
		int answer = 0;
		int[] numbers = new int[n+1];

		for(int i=2; i<=n; i++) numbers[i]=i;

		for(int i=2; i<n; i++) {
			
			if(numbers[i] == 0) continue;
			
			for(int j=2*i; j<=n; j+=i) numbers[j] = 0;
		}
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] != 0) answer++;
		}
		
		return answer;
	}
	
	public int solution2 (int n) {
		int answer = 0;
		boolean flag = true;
		
		for(int i=2; i<=n; i++) {
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag == true) answer++;
			
			flag = true;
		}
		
		return answer;
	}
}
