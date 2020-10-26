package quest.main;

import java.util.HashMap;

public class Day1026 {
	/* 실패율 */
	public static int[] solution(int n, int[] stages) {
		int[] answer = new int[n];
		HashMap<Integer, Double> fail = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			int stageNum = i;
			int failPlayers = 0;
			int totalPlayers = 0;
			
			for(int j=0; j<stages.length; j++) {
				int player = stages[j];
				
				//실패한 플레이어
				if(stageNum == player) {
					failPlayers++;
				}
				
				//통과한 플레이어
				if(player >= stageNum) {
					totalPlayers++;
				}
			}
			
			//실패율, 계산
			double failureRate = 0;
			
			if(failPlayers !=0 && totalPlayers !=0) {
				failureRate = (failPlayers/(double)totalPlayers);
			}
			
			//스테이지 번호, 실패율 저장
			fail.put(stageNum,failureRate);
			
		}
		
		
		return answer;
	}
	
	/* condition */
	public static boolean isValidStages(int n, int[] stages) {
		boolean flag=false;
		if((n>=1 && n<=500) && (stages.length >= 1 && stages.length <= 200000)) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		
	}
}
