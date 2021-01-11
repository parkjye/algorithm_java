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
	
	public String[] solution2(String[] strings, int n) {
		String[] answer = {};
		
		//sun = 012
		//스트링스의 첫번째 단어를 뽑아서 길이를 확인할까?
		
		char[] getChar = strings[0].toCharArray();
		
		System.out.println(getChar[0]);
		System.out.println(getChar[1]);
		System.out.println(getChar[2]);
		System.out.println(getChar[3]);
		
		System.out.println(getChar.length); //각 단어의 길이를 알 수 있음
		
		char[] tmpArr = new char[strings.length];
		
		//for()
		//위와같이 스트링스의 0번째 단어를 char배열에 하나씩 넣는다.
		//그리고 그 중에 n번(2)째 철자를 map에 담기
		//map은 <n번의 철자, strings에서 해당 글자가 포함된 인덱스>
		
		// map을 sort한다. map에서 <철자> 순서 예를 들어 2 1 0순으로 되면
		// strings 배열의 2번의 값을 answer[0]에, 1번 값을 answer[1], 2번 값을 answer[2]에 넣고 리턴한다.
		
		return answer;
	}

}
