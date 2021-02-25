package level01.main;

public class CreateStrangeChar {
	/* 이상한 문자 만들기 */
	public static void main(String[] args) {
		CreateStrangeChar createStr = new CreateStrangeChar();
		
		String s = "try hello world";
		System.out.println(createStr.solution(s));
	}
	
	public String solution(String s) {
		String answer = "";
		int idx = 0;
		
		String[] arrStr = s.split("");
		
		for(String str : arrStr) {
			idx = str.contains(" ") ? 0 : idx++;
			answer += idx%2 == 0 ? str.toLowerCase() : str.toUpperCase();
		}
		
		return answer;
	}

}
