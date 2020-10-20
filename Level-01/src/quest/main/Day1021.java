package quest.main;

import java.util.ArrayList;

public class Day1021 {
	
	/* 최대공약수와 최소공배수 */
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		ArrayList<Integer> list = new ArrayList<>();
		
		//최대공약수
		int j=1;
		
		for(int i=0; i<n; i++) {
			if((n%j==0) && (m%j==0)) {
				list.add(j);
			}
			j++;
		}
		
		answer[0] = list.get(list.size()-1);
		
		//최소공배수 == (두 수의 곱/최대공약수)
		answer[1] = (n*m)/answer[0];

        return answer;
    }
	
	//condition
	public static boolean isValid(int n, int m) {
		boolean flag=false;
		if((n>=1 && n<=1000000) && (m>=1 && m<=1000000)) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int n = 6;
		int m = 4;
		
		if(isValid(n, m)) {
			solution(n, m);
		}
		
	}
}
