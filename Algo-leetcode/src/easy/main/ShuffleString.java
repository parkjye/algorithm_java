package easy.main;

public class ShuffleString {
	/* 1528. Shuffle String */
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
		
		ShuffleString shuffleStr = new ShuffleString();
		System.out.println(shuffleStr.restoreString(s, indices));
	}

	public String restoreString(String s, int[] indices) {
        char[] arrChar = new char[indices.length];
        
        for(int i=0; i<indices.length; i++) {
        	arrChar[indices[i]] = s.charAt(i);
        }
        
        String output = String.valueOf(arrChar);
        return output;
    }
}
