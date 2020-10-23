package quest.main;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	/* 최대공약수 (유클리드 호제법) */
	public static int[] solution2(int n, int m) {
		int[] answer = new int[2];
		
        int x = Math.max(n, m);
        int y = Math.min(n, m);
		
		while (y > 0) {
            int temp = x;
            x=y;
            y=temp%y;
        }
		
        answer[0] = x;
		
		//최소공배수
		answer[1] = (n*m) / answer[0];
		
		return answer;
	}
	
	//condition
	public static boolean isValid(int n, int m) {
		boolean flag=false;
		if((n>=1 && n<=1000000) && (m>=1 && m<=1000000)) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		if(isValid(n, m)) {
			System.out.println(Arrays.toString(solution(n, m)));
			System.out.println(Arrays.toString(solution2(n, m)));
		}
		
	}
}
