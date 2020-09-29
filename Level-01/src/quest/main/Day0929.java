package quest.main;

import java.util.Scanner;

public class Day0929 {
	public static void main(String[] args) {
		
		/* 직사각형 별찍기*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 길이를 입력하세요.");
        int n = sc.nextInt();
        
        System.out.println("세로 길이를 입력하세요.");
        int m = sc.nextInt();
        
        if(isValid(n, m)) {        	
        	for(int i=0; i<m; i++) {
            	for(int j=0; j<n; j++) {
            		System.out.print("*");
            	}
            	System.out.println();
        	}
        }
	}
	
	//n과 m은 각각 1000 이하인 자연수입니다.
	public static boolean isValid(int n, int m) {
		
		boolean flag=true;
		if(n>1000 || m>1000) flag=false;
		
		return flag;
	}
	
}//Day0929
