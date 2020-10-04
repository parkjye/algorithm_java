package quest.main;

import java.util.Scanner;

public class Day1004 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("8글자 이하인 문자열을 입력하세요.");
		String s = scan.nextLine();
		scan.close();
		
		//
		if(isValid(s)) {
			System.out.println(solution(s));
		}else {
			System.out.println("1이상 8이하인 문자열을 입력하세요.");
		}
		
	}
	
	/* 문자열 다루기 기본 */	
	public static boolean solution(String s) {
        boolean answer = true;
        char tmp;
        
        //문자열의 길이가 4 or 6인지 확인
        if(!(s.length()==4 || s.length()==6)) {
        	answer=false;
        } else {
        	
        	//입력받은 문자열 길이만큼 반복
            for(int i=0; i<s.length(); i++) {
            	
            	//입력받은 문자열을 temp에 하나씩 넣기
            	tmp = s.charAt(i);
            	
            	//ASCII로 숫자 48~57
            	if(tmp<=48 || tmp>=57) {
            		answer = false;
            	}else {
            		answer=true;
            	}
            }
        }
        
        return answer;
    }
	
	//입력한 문자열이 8이하인지 확인
	public static boolean isValid(String s) {
		boolean flag=false;
		if(s.length()>=1 && s.length()<=8) flag=true;
		return flag;
	}
}
