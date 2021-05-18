package level02.main;

import java.util.Arrays;

public class Hindex {

	/* H-index */
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		
		Hindex h = new Hindex();
		System.out.println(h.solution(citations));
	}
	
	public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
 
        for (int i=0; i<citations.length; i++) {
            int h = citations.length - i;
 
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
 
        return answer;
    }

}
