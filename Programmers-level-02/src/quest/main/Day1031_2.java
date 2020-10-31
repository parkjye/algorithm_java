package quest.main;

public class Day1031_2 {
	/* 이상한 문자 만들기 */
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		int cnt = 0;
		
		String getStrArr[] = s.split("");
        
		for(int i=0; i<getStrArr.length; i++){
			
		  if(getStrArr[i].equals(" ")){
			  cnt = 0;
		     
		  }else{
			  
		     if(cnt % 2 == 0){
		    	cnt++;
		        getStrArr[i] = getStrArr[i].toUpperCase();
		        
		     }else{
		    	 cnt++;
		         getStrArr[i] = getStrArr[i].toLowerCase();
		     }
		  }
		  answer += getStrArr[i];
		}
		
		System.out.println(answer);
	}
}
