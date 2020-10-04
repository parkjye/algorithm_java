package quest.main;

import java.util.Scanner;

public class Day1004_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("4글자 또는 6글자 숫자를 입력하세요.");
		String s = scan.nextLine();
		scan.close();
		
		/**/
		if(isValid(s)) {
			System.out.println(solution(s));
		}else {
			System.out.println("8자 이하로 입력하세요");
		}
		
	}
	
	/* 문자열 다루기 기본 */	
	public static boolean solution(String s) {
        boolean answer = false;
        
        if(s.length()==4 || s.length()==6) {
        	answer = s.matches("^[0-9]*$");
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
