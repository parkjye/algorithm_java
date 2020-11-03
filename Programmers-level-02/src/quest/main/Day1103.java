package quest.main;

import java.util.LinkedList;
import java.util.Queue;

public class Day1103 {
	/* 다리를 지나는 트럭 */
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int getBridgeWe = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<truck_weights.length; i++) {
			if(queue.isEmpty()) {
				queue.add(truck_weights[i]);
				getBridgeWe += truck_weights[i];
				answer++;
				
			}else if(queue.size() == bridge_length) {
				getBridgeWe -= queue.poll();
				
			}else if(getBridgeWe > weight){
				//다리 무게가 초과되면
					
			}else {
				queue.add(truck_weights[i]);
				getBridgeWe += truck_weights[i];
				answer++;
			}
		}

		return answer;
	}
	
	
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length,weight,truck_weights));
	}
}
