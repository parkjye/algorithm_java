package quest.main;

import java.util.Arrays;

public class Date21_0111 {
	/* 문자열 내 마음대로 정렬하기 */
	public static void main(String[] args) {
		Date21_0111 sortStr = new Date21_0111();
		
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		System.out.println(sortStr.solution(strings, n));
	}
	
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		
		if(n <= 0) {
			Arrays.sort(strings);
			answer = strings.clone();
			
		}else if(n > 0){
			
			for(int i=0; i<strings.length-1; i++) {
				char getCh1 = strings[i].charAt(n);
				char getCh2 = strings[i+1].charAt(n);
				
				if(getCh1 > getCh2) {
					String tmp = strings[i];
					
					strings[i] = strings[i+1];
					strings[i+1] = tmp;
					
					// -1로 초기화를 해줘야 반복문에서 i++을 하면 0으로 된다.
					i = -1;
					
				}else if(getCh1 == getCh2) {
					
					if(strings[i].compareTo(strings[i+1]) > 0) {
						String tmp = strings[i];
						
						strings[i] = strings[i+1];
						strings[i+1] = tmp;
						
						i = -1;
					}
				}
			}
			
			answer = strings.clone();
		}
		
		return answer;
	}

}
