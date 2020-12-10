package quest.main;

import java.util.Arrays;

public class Day1210 {
	/* 완주하지 못한 선수 */
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		int i = 0;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		while(i < participant.length) {
			if(i==participant.length-1) {
				answer = participant[i];
				break;
			}
			
			if(!participant[i].equals(completion[i])) {
				answer += participant[i];
				break;
			}
			i++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		Day1210 uncompleted = new Day1210();
		System.out.println(uncompleted.solution(participant, completion));

	}

}
