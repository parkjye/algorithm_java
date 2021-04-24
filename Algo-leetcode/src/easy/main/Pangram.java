package easy.main;

import java.util.ArrayList;

public class Pangram {
	/* 1832. Check if the Sentence Is Pangram */
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";

		Pangram checkPangram = new Pangram();
		System.out.println(checkPangram.checkIfPangram(sentence));
		
	}
	
	public boolean checkIfPangram(String sentence) {
		ArrayList<String> list = new ArrayList<>();
        boolean flag = false;

		if(sentence.length() < 26) return flag;
		else {

			String[] arrStr = sentence.split("");
			
			for(String s : arrStr) {
				if(!list.contains(s)) list.add(s);
			}
			
			if(list.size() == 26) flag=true;
			
		}

		return flag;
	}

}
