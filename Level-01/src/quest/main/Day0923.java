package quest.main;

import java.util.ArrayList;

public class Day0923 {
	/* 모의고사(수포자들) */
	public static void main(String[] args) {
		//int[] answers = {1, 3, 2, 4, 2};
		int[] answers = {1, 2, 3, 4, 5};
		solution(answers);
    }
	
	public static int[] solution(int[] answers) {
	    int[] m1 = {1, 2, 3, 4, 5};
	    int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
	    int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	    
	    //정답 수를 담을 배열
	    int[] correct = {0, 0, 0};
	    
	    //수포자들이 답안을 반복하니까 인덱스를 초기화(i % 각 답안의 길이) 한다 
	    for(int i=0; i<answers.length; i++) {
		    if(answers[i] == m1[i%5]) correct[0]++;
		    if(answers[i] == m2[i%8]) correct[1]++;
		    if(answers[i] == m3[i%10]) correct[2]++;
	    }
	    
	    //최고득점을 찾는다.
	    int maxCorrect = Math.max(correct[0], Math.max(correct[1], correct[2]));
	    
	    //최고득점자를 담을 list.
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    /*
	     * 최고득점을 얻은 수포자를 list에 담아야한다.
	     * (ex. 수포자1이 고득점자면 list에 1을 넣음)
	     * 
	     * 인덱스가 0부터 시작하니까 +1을 해서 수포자 번호를 맞춘다.
	     * */
	    for(int i=0; i<correct.length; i++) {    	
	    	if(maxCorrect == correct[i]) list.add(i+1);
	    }

	    int[] answer = new int[list.size()];

	    for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
	    
	    return answer;
	}
	
}
