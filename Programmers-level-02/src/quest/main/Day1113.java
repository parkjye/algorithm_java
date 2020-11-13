package quest.main;

import java.util.Arrays;

public class Day1113 {
	/* 구명보트 */
	public int solution(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		
		//몸무게가 가장 작은 사람과, 가장 큰 사람
		int small = 0;
		int max = people.length-1;
		
		while(max >= small) {			
			//몸무게가 가장 작은 사람과 큰사람을 같이 보낸다.
			if(limit >= people[small] + people[max]) {
				small++;
				max--;
				
			}else {
				max--;
			}
			answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Day1113 lifeBoat = new Day1113();
		
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		
		System.out.println(lifeBoat.solution(people, limit));
		
	}
}
