package quest.main;

import java.util.ArrayList;
import java.util.Collections;

public class Date21_0112 {

	/* 최댓값과 최솟값 */
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		
		Date21_0112 minMax = new Date21_0112();
		System.out.println(minMax.solution(s));
	}
	
	public String solution(String s) {
		String answer = "";
		ArrayList<Integer> list = new ArrayList<>();
		String[] getStr = s.split(" ");
		
		for(int i=0; i<getStr.length; i++) list.add(Integer.parseInt(getStr[i]));
		
		Collections.sort(list);
		answer = list.get(0) + " " + list.get(list.size()-1);
		
		return answer;
	}
	

}
