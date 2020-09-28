package quest.main;

import java.util.Scanner;

public class Day0926 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알파벳으로 이루어진 문자열");
		String str = scan.nextLine();
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		scan.close();
		
		//입력받은 문자열이 true인지 확인
		boolean isString = checkCondition(str, num);

		//true이면 함수호출
		if(isString) System.out.println(solution(str, num));
		
	}
	
	/*시저 암호 */	
	public static String solution(String s, int n) {
		String answer = "";
		
		if(s.length()>8000 || (n==0 || n>=25)) {
			System.out.println("입력 조건 안맞음");
			return answer;
		}
		
		// char형 배열에 담는다.
		char strArray[] = s.toCharArray();
		
		for(int i=0; i<strArray.length; i++) {
			
			//배열 선언
			int[] resultInt = new int[strArray.length];
			char[] resultChr = new char[strArray.length];
			
			//문자배열을 아스키로 변환하고
			int getAsc = (int)strArray[i];
			
			//공백은 32, getAsc값이 2번이면 그대로 넣고
			//그 외의 숫자는 입력받은 숫자만큼 더해서 int[]에 담는다.
			//단, 90(Z)와 122(z) 다시 A, a부터 시작할 수 있게 한다.
			if(getAsc==32) {
				resultInt[i] = 32;
				
			} else if(getAsc==90){
				resultInt[i] = 65+(n-1);
				
			}else if(getAsc==122){
				resultInt[i] = 97+(n-1);
				
			}else {
				resultInt[i] = getAsc+n;
				
			}
			
			//다시 int[]를 char형으로 형변환
			resultChr[i] = (char)resultInt[i];
			
			//answer가 String type이니까 char[] 값을 차례로 answer에 더해서 넣어준다.
			answer += Character.toString(resultChr[i]);	
			
		}
		
		return answer;
	    
	}
	
	//문자열 확인 메소드(수정)
	static boolean checkCondition(String str, int num) {
		boolean flag=false;
		
		//입력받은 문자열을 문자배열로 변환
		char getChar[] = str.toCharArray();
		
		//알파벳(대소문자)인지 확인
		for(int i=0; i<getChar.length; i++) {
			
			if((getChar[i]>=65 && getChar[i]<90) || (getChar[i]>=97 && getChar[i]<=122) || getChar[i]==32) {
				flag=true;
				continue;
			} else {
				System.out.println("알파벳 아님. 종료합니다.");
				break;
			}
		}
		
		return flag;
	}
	
	
	
}//Day0926
