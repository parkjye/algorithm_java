package quest.main;

import java.util.Arrays;

public class Date21_0126 {
	/* 전화번호 목록 */
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		Date21_0126 phoneList = new Date21_0126();
		System.out.println(phoneList.solution(phone_book));
			
	}

	public boolean solution(String[] phone_book) {
		boolean answer = true;
		
		Arrays.sort(phone_book);
		String corr = phone_book[0];
		
		for(int i=1; i<phone_book.length; i++) {
			
			if(phone_book[i].contains(corr)) {
				answer = false;
				break;
			}
		}
		
		return answer;
	}
}
