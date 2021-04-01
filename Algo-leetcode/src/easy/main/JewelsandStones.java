package easy.main;

import java.util.Arrays;

public class JewelsandStones {
	/* 771. Jewels and Stones */
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		JewelsandStones cntJewels = new JewelsandStones();
		System.out.println(cntJewels.numJewelsInStones(jewels, stones));
		
	}
	
	public int numJewelsInStones(String jewels, String stones) {
        String[] spJewels = jewels.split("");
        String[] spStones = stones.split("");
        
        int output = 0;
        for(int i=0; i<spJewels.length; i++) {
        	
        	for(int j=0; j<spStones.length; j++) {
        		
        		if(spJewels[i].equals(spStones[j])) output++;
        	}
        }
        
        return output;
        
    }

}
