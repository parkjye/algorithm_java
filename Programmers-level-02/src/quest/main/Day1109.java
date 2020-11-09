package quest.main;

public class Day1109 {
	/* 조이스틱 */
	public int solution(String name) {
		int answer=0;
		int move=0;
		int getAscii = 0;
		
		byte[] getByte = name.getBytes();
		
		for(int i=0; i<getByte.length; i++) {
			getAscii = getByte[i]-65;
			
			//알파벳 만드는 스틱조작 수
			if(getAscii <= 13) answer += getByte[i]-65;
			else answer += 26-(getByte[i]-65);
		}
		
		/*
		 * 문자 위치 이동: move.
		 * 
		 * 글자수-1만큼 위치를 이동해야 한다.
		 * 근데 글자중에 A가 있으면 이동할 필요가 없으므로(초기 값이 A라서)
		 * A갯수만큼 move를 뺀다.
		 * */		
		move = getByte.length-1;
		
		for(int i=0; i<getByte.length; i++) {
			if(getByte[i]==65) move--;
		}
		
		return answer+move;
	}
	
	/* 제한 사항 */
	public static boolean isValid(String name) {
		boolean flag=false;
		
		if(name.length() >=1 && name.length() <=20) {
			for(int i=0; i<name.length(); i++) {
				if(Character.isUpperCase(name.charAt(i))) flag=true;
			}
		}

		return flag;
	}
	
	public static void main(String[] args) {
		String name = "JEROEN";
		
		Day1109 joyStick = new Day1109();
		
		if(isValid(name)) {
			System.out.println(joyStick.solution(name));
		};
	}
}
