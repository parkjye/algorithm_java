package quest.main;

import java.util.Stack;

public class Day1012 {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();

		//크레인 이동
		for(int crane : moves) {
			//1부터 시작하니까
			int j = crane-1;
			
			//첫번째 칸 1,0 -> 2,0 -> 3,0 순으로 확인해야함
			for(int i=0; i<board.length; i++) {
				//크레인이 0에 걸려도 진행
				if(board[i][j] == 0) continue;
				
				//board 위치값을 인형에 넣어준다.
				int getDoll = board[i][j];
				
				//초기화
				board[i][j] = 0;
				
				//바구니가 비어있으면 그대로 넣기
				if(stack.isEmpty()) {
					stack.push(getDoll);
					
				//비어있지 않으면 마지막 값이랑 비교해서 동일하면 삭제
				}else if(getDoll == stack.peek()){
					stack.pop();
					
					//삭제된 값을 저장 (같은 인형이면 둘 다 삭제되니까 2씩 증가)
					answer += 2;
					
				}else {
					//바구니가 비어있지 않고, 마지막 값이랑 동일하지 않으면
					stack.push(getDoll);
				}
				
				break;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		int[][] board= {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		
		System.out.println(solution(board, moves));
		
	}

}//
