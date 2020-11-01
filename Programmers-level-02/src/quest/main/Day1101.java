package quest.main;

public class Day1101 {
	public String solution(String[] seoul) {
        String answer = "";
        int getNum = 0;
        
        for(int i=0; i<seoul.length; i++){
            if("Kim".equals(seoul[i])) getNum = i;
        }
        
        answer="김서방은 "+getNum+"에 있다";
        
        return answer;
    }

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Park", "Kim"};
		
		Day1101 findKim = new Day1101();
		System.out.println(findKim.solution(seoul));
	}
}
