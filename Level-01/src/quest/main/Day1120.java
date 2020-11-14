package quest.main;

public class Day1120 {
	/* 핸드폰 번호 가리기 */
	public String solution(String phone_number) {
		String answer="";
		
		int startNum = phone_number.length()-4;
		int endNum = phone_number.length();
		
		for(int i=0; i<=startNum-1; i++) answer += "*";

		answer += phone_number.substring(startNum, endNum);
		
		return answer;
	}
	
	/* 제한 조건 */
	public static boolean isValid(String phone_number) {
		boolean flag=false;
		if(phone_number.length() >= 4 && phone_number.length() <= 20) flag=true;
		
		return flag;
	}
	
	public static void main(String[] args) {
		String phone_number = "0103334444";
		
		Day1120 hideNumber = new Day1120();
		
		if(isValid(phone_number)) {
			System.out.println(hideNumber.solution(phone_number));
		}
		
	}
}
