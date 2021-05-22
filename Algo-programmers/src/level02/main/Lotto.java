package level02.main;

import java.util.Arrays;

public class Lotto {
	/* 로또의 최고 순위와 최저 순위 */
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		Lotto plz = new Lotto();
		System.out.println(plz.solution(lottos, win_nums));

	}

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int correctNum = 0;
		int cntZero = 0;
		
		Arrays.sort(lottos);
		
		for(int i=0; i<lottos.length; i++) {
			if(lottos[i]==0) cntZero++;
			
			for(int j=0; j<win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) correctNum++;
			}
		}
		
		answer[0] = getRank(correctNum+cntZero);
		answer[1] = getRank(correctNum);

		return answer;
	}
	
	public static int getRank(int n) {
		
		switch(n) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
		}
	}
}
