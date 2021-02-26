package level01.main;

public class CreateStrangeChar {
	/* 이상한 문자 만들기 */
	public static void main(String[] args) {
		CreateStrangeChar createStr = new CreateStrangeChar();
		
		String s = "try hello world";
		System.out.println(createStr.solution(s));
		System.out.println(createStr.solution2(s));

	}
	
	public String solution(String s) {
		String answer = "";
		int idx = 0;
		
		String[] arrStr = s.split("");
		
		for(String str : arrStr) {
			idx = str.contains(" ") ? 0 : idx+1;
			answer += idx%2 == 0 ? str.toLowerCase() : str.toUpperCase();
		}
		
		return answer;
	}
	
	public String solution2(String s) {
		String answer = "";
		int cnt = 0;
		
		String getStrArr[] = s.split("");
		  
		for(int i = 0; i<getStrArr.length; i++){
			
			if(getStrArr[i].equals(" ")){ 
				cnt = 0;
				
			} else{
				
				if(cnt % 2 == 0){
					cnt++;
					getStrArr[i] = getStrArr[i].toUpperCase();
					
				} else{
					cnt++;
					getStrArr[i] = getStrArr[i].toLowerCase();
					
				}
			}
		
			answer += getStrArr[i];
		}
		    
	    return answer;
	}

}
