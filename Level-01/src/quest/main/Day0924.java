package quest.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Day0924 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = scan.nextInt();
		
		//solution(n);
		solution2(n);
		
		scan.close();
	}
	
	public static int solution2(int n) {	
		int answer = 0;
		
		//exception
        if(n>1000000) {
        	System.out.println("입력한 숫자가 1,000,000보다 큽니다. 종료합니다.");
        	return answer;
        }
		
        for (int i=2; i <= n; i++) {
            boolean flag = false;
            
            for (int j=2; j<=i/2; j++) {
                if (i % j == 0) {
                	flag = true;
                    break;
                }
            }
            
            //소수찾을때마다 ++
            if (flag) {
                answer++;
            }
        }
        
        return answer;
	}
	
	
	/********************************************/
	public static int solution(int n) {
        int answer = 0;
        int indexNum = 0;      

        ArrayList<Integer> getList = new ArrayList<>();
		//getList.add(1);
        
        //exception
        if(n>1000000) {
        	System.out.println("입력한 숫자가 1,000,000보다 큽니다. 종료합니다.");
        	return answer;
        }  
        
        for(int i=2; i<=n; i++) {
        	
        	indexNum = n%i;
        	getList.add(indexNum);

        	//
        	System.out.println("j["+i+"] "+indexNum);
        	
        	//여기 다시
        	for(int j=1; j>=n; j++) {
	        	if(getList.get(0)==0 && getList.size()==0) {
	        		System.out.println("소수: "+getList.get(indexNum));
	        		
	        	}
        	}
        }
        
        return answer;
    }
}
