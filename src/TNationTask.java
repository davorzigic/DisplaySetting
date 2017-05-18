

public class TNationTask {


	/***
	 * 
	 * @param s string inputed
	 * @param maxChar num of chars that we want to split string
	 * @return returns array of splitted strings
	 */
	public static String[] maxNumOfChar(String s, int maxChar, int maxLines) {

		int arrayLength = s.length() / maxChar;

		String[] substrings = new String[maxLines];

		if (s.length() == 0) {
			System.out.println("String is empty.");
			return null;
		} else if (s.length() < maxChar) {
			System.out.println("You have to enter less max number of chars");
		} else {

			int j = 0;
			int lastIndex = substrings.length - 1;

			for (int i = 0; i < maxLines-1; i++) {

				if(i == 0) {
					substrings[i] = s.substring(j, j + maxChar);
					j += maxChar;
				} else {
				// if the first char in line is space
					String test = s.substring(j, j+1);
					System.out.println(test);
					if(!test.equals(" ")) { 
						substrings[i] = " " + s.substring(j, j + maxChar-1);
						j += maxChar-1;
					} else {
						substrings[i] = s.substring(j, j + maxChar);
						j += maxChar;
					}
				
				}
				
			}
			String empty = s.substring(j-1,j);
			if(!empty.equals(" ")) {
				substrings[maxLines-1] = " " + s.substring(j);
			} else {
				substrings[maxLines-1] = s.substring(j);
			}
			

			return substrings;
		}
		
		return null;
	}
	
	public static void maxLines(int maxLines) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "9:00 John Doe until 10 30 at Office";
		
		String[] string = maxNumOfChar(test, 11, 4);
		

		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		
		

	}

}
