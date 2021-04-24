package level01.main;

public class AddNagtivePositive {
	/* 음양 더하기 */
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		
		AddNagtivePositive addNP = new AddNagtivePositive();
		System.out.println(addNP.solution(absolutes, signs));
		
	}

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i=0; i<absolutes.length; i++) {
			
			if(signs[i] == true) answer += absolutes[i];
			else answer += (absolutes[i] * -1);
		}
		
		return answer;
	}
}
