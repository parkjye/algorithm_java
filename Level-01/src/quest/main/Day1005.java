package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Day1005 {
	public static void main(String[] args) {
		
		String s ="aBcD";
		
		//
		String answer = "";
		
		
		/*문자열을 byte 배열로 받기(ASCII코드)
		byte[] getByte = s.getBytes();
		System.out.println(Arrays.toString(getByte));
		*/
		
		
		char[] getChar = s.toCharArray();
		System.out.println(getChar[0]);

		//char null 초기화 방법
		char resultChar = '\u0000';
		
		int temp = 0;
		
		
		
	}


	/* 이상한 문자 만들기 */
	
	/*
	 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
	 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수를 완성하세요.
	 * 
	 * [ 제한사항 ]
	 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다
	 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	 * 
	 * try hello world	--> TrY HeLlO WoRlD
	 * 
	 * */
	public String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        //문자열 byte로 담기
        //대소문자 차이는 32.
        
        //소문자 숫자범위에 포함되면 -32
        //대문자 숫자범위에 포함되면 +32
        //공백은 126
        
        /**/
        
        
        
        for(int i=0; i<s.length(); i++) {
        	
        }
        
        
        
        
        return answer;
    }
}
