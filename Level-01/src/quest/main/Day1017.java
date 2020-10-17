package quest.main;

public class Day1017 {	
	
	/* 하샤드 수 */
	public static boolean solution(int x) {
        boolean answer = true;
        int getSum = 0;

        String temp = Integer.toString(x);
        String[] getArr = String.valueOf(temp).split("");
        
        int[] getInt = new int[getArr.length];

        for(int i=0; i<getArr.length; i++) {
        	getInt[i] = Integer.parseInt(getArr[i]);
        	getSum += getInt[i];
        }
        
        if(x%getSum==0) {
    		return answer;
    	}else {
    		return answer = false;
    	}
        
    }
	
	public static boolean isValid(int x) {
		boolean flag=false;
		if(x>1 && x<10000) flag=true;
		return flag;
	}
	
	public static void main(String[] args) {
		int x=18;
		
		if(isValid(x)) {
			System.out.println(solution(x));
		}
		
	}
}
