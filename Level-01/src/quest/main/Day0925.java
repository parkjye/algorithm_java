package quest.main;

import java.util.Scanner;

public class Day0925 {
	public static void main(String[] args) {
		
		//test Data
		System.out.println(solution("abcdefghi"));
		System.out.println(solution("qwer"));
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		
		String str = scan.next();
		solution(str);
		scan.close();
		*/
		
	}
	
	public static String solution(String str) {
        String answer = "";
        int getIdx = 0;
        
        //exception
        if(str.length()<1 || str.length()>100) {
        	System.out.println("입력한 글자가 100자 초과입니다. 종료.");
     
        	return answer;
        }
        
        //문자 홀짝 구분
        if(str.length()%2==0) {
        	getIdx = str.length() / 2 ;
        	answer = str.substring(getIdx-1, getIdx+1);

        } else {
        	getIdx = str.length() / 2;
        	answer = str.substring(getIdx, getIdx+1);
        	
        }
        
        return answer;
    }
	
}//Day0925
