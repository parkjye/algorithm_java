package quest.main;

public class Day0923 {
	public static void main(String[] args) {
	    int[] answer = {};
	    
	    //수포자들
	    int[] m1 = {1, 2, 3, 4, 5};
	    int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
	    int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	    
	    //정답수
	    int m1Count = 0; 
	    int m2Count = 0;
	    int m3Count = 0;
	    
	    //1등 자리
	    int maxCnt=0;
	    
	    for(int i=0; i<answer.length; i++) {
		    if(answer[i] == m1[i]) m1Count++;
		    if(answer[i] == m2[i]) m2Count++;
		    if(answer[i] == m3[i]) m3Count++;
	    }
	    
	    maxCnt = Math.max(m1Count, Math.max(m2Count, m3Count));
	    
	    if(maxCnt==m1Count) {
	    	System.out.println("가장 문제를 많이 맞힌 사람은 수포자1 입니다.");
	    }else if(maxCnt==m2Count) {
	    	System.out.println("가장 문제를 많이 맞힌 사람은 수포자2 입니다.");
	    }else {
	    	System.out.println("가장 문제를 많이 맞힌 사람은 수포자3 입니다.");
	    }
	    
	    //맞춘 문제 수 출력
	    
    }
	
}//Day0923
