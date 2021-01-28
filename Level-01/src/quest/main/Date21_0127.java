package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Date21_0127 {
	/* 신규 아이디 추천 */
	public static void main(String[] args) {
		String new_id = "........AB......@abcdefgefgh.i.jklm2-_.......";
		String new_id2 = ".:¥(@(¥:&(&.";
		String new_id3 = "...!@BaT#*..y.abcdefghijklm";
		String new_id4 = "=.=";
		
		Date21_0127 recommendID = new Date21_0127();
		System.out.println(recommendID.solution(new_id));
	}
	
	public String solution(String new_id) {
		String answer = "";
        
        //1단계: 소문자 치환
        new_id = new_id.toLowerCase();
        
        //2단계: 소문자, 숫자, -, _, .를 제외한 문자 제거
        String regularStr = "[^a-z0-9-_.]";
        new_id = new_id.replaceAll(regularStr, "");

        //3단계: .가 2번 이상 연속되면 하나로 치환
        regularStr = "\\.{2,}";
        new_id = new_id.replaceAll(regularStr, ".");
        
        //4단계를 위해서 list에 문자열을 대입
        ArrayList<Character> charList = new ArrayList<>();
        
        for(int i=0; i<new_id.length(); i++) {
            charList.add(new_id.charAt(i));
        }
        
        //4단계: 마침표(.)가 처음이나 끝에 위치하면 제거        
        if (charList.size() > 0) {
            if(charList.get(0) == '.' ) charList.remove(0);
            if(charList.size() > 0 && '.' == charList.get(charList.size()-1) ) 
            	charList.remove(charList.size()-1);
        }
        
        //5단계: 빈 문자열이라면 "a"를 대입
        if(charList.size() == 0) charList.add('a');

        //6단계를 위해서 list에 있는 값을 String answer에 대입 
        for(Character i : charList) {
				answer += i;
		}
		
        //6단계: 길이가 16자 이상이면, 첫 15개의 문자까지만 남김
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);

            //제거 후 가장 끝에 .가 있으면 제거 
            if(answer.charAt(answer.length()-1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        //7단계: 길이가 2자 이하라면, 길이가 3이 될 때까지 마지막 문자를 반복해서 붙힘
        if(answer.length() <= 2) {
            while(answer.length() < 3) {
                answer += answer.substring(answer.length()-1);
            }
        }
        
        return answer;
	}
}
