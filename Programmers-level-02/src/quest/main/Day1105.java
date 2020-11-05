package quest.main;

public class Day1105 {
	public String solution(String number, int k){
		StringBuilder answer = new StringBuilder();
		
		if(number.charAt(0)=='0') return "0";
		
		int idx = 0;
		char max;

		for(int i=0; i<number.length()-k; i++) {
			max='0';
			
			for(int j=idx; j<=i+k; j++) {
				if(max<number.charAt(j)) {
					max=number.charAt(j);
					idx=j+1;
				}
			}
			answer.append(max);
		}
		
		return answer.toString();
	}
	
	/* 제한 조건 */
	public static boolean isValid(String number, int k) {
		boolean flag=false;
		int n = Integer.parseInt(number);
		if((n >= 1 && n <= 1000000) && (k>=1 && k<=n)) flag=true;
		
		return flag;
	}
	
	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		
		Day1105 makeMaxnum = new Day1105();
		
		if(isValid(number, k)) {
			System.out.println(makeMaxnum.solution(number, k));
		}
		
	}
}
