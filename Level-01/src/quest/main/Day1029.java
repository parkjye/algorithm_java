package quest.main;

public class Day1029 {
	
	/* 예산 */
	public static int solution(int[] d, int budget) {
		int answer = 0;

		for(int i=0; i<d.length; i++) {
			budget = budget - d[i];
			
			if(budget <= 0) break;
			answer++;
		}
		
		return answer;
	}
	
	/* conditions */
	public static boolean isValidD(int[] d) {
		boolean flagD=false;
		
		if((d.length >= 1 && d.length <= 100)) {
			
			for(int i=0; i<d.length; i++) {
				if(d[i] >=1 && d[i] <= 100000) flagD=true;
			}
		}
	
		return flagD;
	}
	
	public static boolean isValidBud(int budget) {
		boolean flagB = false;
		
		if(budget >= 1 && budget <= 10000000)flagB = true;
		
		return flagB;
	}
	
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		if(isValidD(d) && isValidBud(budget)) {
			System.out.println(solution(d, budget));
		}
	}
}
