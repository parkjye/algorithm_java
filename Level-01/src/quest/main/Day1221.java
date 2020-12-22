package quest.main;

public class Day1221 {
	public boolean solution(String s) {
		boolean answer = true;		
		int cntP = 0, cntY = 0;
		char temp = ' ';
		
		for(int i=0; i<s.length(); i++) {
			temp = s.charAt(i);
			
			if(temp=='P' || temp=='p') cntP++;
			else if(temp=='Y' || temp=='y') cntY++;
		}
		
		if(cntP!=cntY) answer = false;

		return answer;
	}
	
	public static void main(String[] args) {
		String s = "pPoooyY";
		
		Day1221 findPY = new Day1221();
		System.out.println(findPY.solution(s));
	}

}
