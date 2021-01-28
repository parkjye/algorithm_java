package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Date21_0127 {
	/* 신규 아이디 추천 */
	public static void main(String[] args) {
		String new_id = "... .....aB......@abcdefgefgh.i.jklm2-_.......";
		
		Date21_0127 recommendID = new Date21_0127();
		System.out.println(recommendID.solution(new_id));
	}
	
	public String solution(String new_id) {
		String answer = "";
		
		if(new_id.length() > 1000) {
			return answer;
		}else {
			
			//1단계. 소문자 치환
			new_id = new_id.toLowerCase();
			System.out.println("1단게: "+new_id);

			//2단계. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
			String regularStr = "[^-_.0-9a-z]";
			new_id = new_id.replaceAll(regularStr, "");
			System.out.println("2단계: "+new_id);
			
			//3단계 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			//3단계 작업 전 list에 값 add.
			ArrayList<Character> charList = new ArrayList<>();
			
			for(int i=0; i<new_id.length(); i++) {
				charList.add(new_id.charAt(i));
			}
			
			ArrayList<Character> charListTwo = new ArrayList<>();
			char tmpChar = 'a';
			
			for(Character i : charList) {
				if(tmpChar == i) continue;
				else {
					charListTwo.add(i);
					tmpChar = i;
				}
			}
			
			System.out.println("3단계: "+charListTwo+" 사이즈: "+charListTwo.size());

			//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
			if(charListTwo.get(0) == '.' ) charListTwo.remove(0);
			if('.' == charListTwo.get(charListTwo.size()-1) ) charListTwo.remove(charListTwo.size()-1);
			System.out.println("4단계: "+charListTwo+" 사이즈: "+charListTwo.size());

			
			//5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
			if(charListTwo.size() == 0) charListTwo.add('a');
			System.out.println("5단계: "+charListTwo+" 사이즈: "+charListTwo.size());
			
			//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
			//만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
			for(Character i : charListTwo) {
				answer += i;
			}
			
			if(answer.length() >= 16) {
				answer = answer.substring(0, 16);
				
				if(answer.charAt(answer.length()-1) == '.') {
					answer = answer.substring(0, answer.length() - 1);
				}
			}
			
			System.out.println("6단계: "+answer+" 사이즈: "+answer.length());
			
			
			//7단계 new_id의 길이가 2자 이하라면, 
			//new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
			if(answer.length() <= 2) {
				while(answer.length() < 3) {
					answer += answer.substring(answer.length()-1);
				}
			}
			
		}
		
		return answer;
	}
}
