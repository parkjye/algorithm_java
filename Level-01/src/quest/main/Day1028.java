package quest.main;

public class Day1028 {
	/* 문자열 다루기 기본 */
	public boolean solution(String s) {
		boolean answer = true;
		int getSize = s.length();
		
		if(getSize>=4 || getSize<=6) {
			try {
				int getAscii = Integer.parseInt(s);
			}catch(NumberFormatException e) {
				answer=false;
			}
		}

		return answer;
		
	}

    public boolean solution2(String s) {
        boolean answer = true;
        int getSize = s.length();

        if(getSize==4 || getSize==6) {
        	
        	for(int i=0; i<getSize; i++) {
            	int getAscii = s.charAt(i);
            	
            	if(getAscii >=48 && getAscii <=57) {
            		answer=true;
            	}else {
            		answer=false;
            		break;
            	}
            }
            
        }else {
            answer = false;
        }
        
        return answer;
    }
    
    public static boolean isValid(String s){
        boolean flag=false;
        int getSize = s.length();
        
        if(getSize>=1 && getSize<=8) flag=true;
        return flag;
    }
    
    public static void main(String[] args) {
		String s = "a1234b";
		
		Day1028 strHandling = new Day1028();
		
		if(isValid(s)) {
			System.out.println(strHandling.solution(s));
			System.out.println(strHandling.solution2(s));
		}else {
			System.out.println("Not Valid");
		}
	}
}
