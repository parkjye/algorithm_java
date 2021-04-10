package quest.main;

public class Date21_0404 {
	/* 이진 변환 반복하기 */
	public static void main(String[] args) {
		Date21_0404 repeatBinary = new Date21_0404();

		String s = "110010101001";
		System.out.println(repeatBinary.solution(s));

	}

	public int[] solution(String s) {
		int[] answer = new int[2];
		
		while(s.length() > 1) {
			
			int cntOne = 0;
			for(int i=0; i<s.length(); i++) {
				
				if(s.charAt(i) == '0') answer[1]++;
				else cntOne++;
				
			}
			
			s = Integer.toBinaryString(cntOne);
			answer[0]++;

		}

        return answer;
	}
}
