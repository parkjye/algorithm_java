package quest.main;

public class Day1207 {
	/* 체육복 */
	public int solution(int n, int[] lost, int[]reserve) {
		int answer = 0;
		int lostClothes = 0; //도난당한 학생 중 여벌옷을 가지고 있는 학생
		int getClothes = 0; //다른 학생에게 체육복을 받은 학생
		
		//여벌옷을 가지고 있는 학생이 옷을 도난 당했으면 빌려줄 수 없도록 -1한다.
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i]==reserve[j]) {
					lostClothes++;
					
					lost[i] = -1;
					reserve[j] = -1;
					
					break;
				}
			}
		}
		
		//옷을 빌려준 학생도 -1처리 한다.
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
					getClothes++;
					reserve[j] = -1;
					
					break;
				}
			}
		}
		
		//전체학생 - 도난당한 학생 + 도난당한 학생 중 여벌옷이 있는 학생 + 체육복을 받은 학생 수
		answer = n - lost.length + lostClothes + getClothes;
		
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		Day1207 training = new Day1207();
		
		System.out.println(training.solution(n, lost, reserve));
	}
}
