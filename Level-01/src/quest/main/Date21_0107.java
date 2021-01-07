package quest.main;

public class Date21_0107 {
	/* 이상한 문자 만들기 */
	public static void main(String[] args) {
		String s = "try hello world";
		
		Date21_0107 strangeStr = new Date21_0107();
		System.out.println(strangeStr.solution(s));
	}
	
	public String solution(String s) {
		String answer = "";
		String[] strArr = s.split("");
		
		int idx = 0;
		
		for(int i=0; i<strArr.length; i++) {
			if((" ").equals(strArr[i])) idx = 0;
			else {
				if(idx%2==0) {
					idx++;
					strArr[i] = strArr[i].toUpperCase(); 
				}else {
					idx++;
					strArr[i] = strArr[i].toLowerCase();
				}
			}
			answer += strArr[i];
		}

		return answer;
	}

}
