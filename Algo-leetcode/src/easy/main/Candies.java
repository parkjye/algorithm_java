package easy.main;

import java.util.ArrayList;
import java.util.List;

public class Candies {
	/* 1431. Kids With the Greatest Number of Candies */
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		
		System.out.println(kidsWithCandies(candies, extraCandies));
		
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {   
        ArrayList<Boolean> list = new ArrayList<>();
        
        int maxKid = 0;
        for(int i : candies) 
            maxKid = Math.max(maxKid, i);
            
        for(int candy : candies) {
            int tmp = candy + extraCandies;
            
            if(tmp >= maxKid) list.add(true);
            else list.add(false);
        }
        
        return list;
    }

}
