

public class TNationTask {


	/***
	 * 
	 * @param s string inputed
	 * @param maxChar num of chars that we want to split string
	 * @return returns array of splitted strings
	 */
	public static String[] maxNumOfChar(String s, int maxChar, int maxLines) {
		
		
		// Cheking if we can fit number of 'maxLines' given
		int biggerThan = maxChar * maxLines;
		if(s.length() < biggerThan) {
			System.out.println("You have to enter less max lines.");
			return null;
		}
		
		
		String[] substrings = new String[maxLines];

		// Boundaries
		if (s.length() == 0) {
			System.out.println("String is empty.");
			return null;
		} else if (s.length() < maxChar) {
			System.out.println("You have to enter less max number of chars");
		} else {

			int j = 0;
			
			for (int i = 0; i < maxLines-1; i++) {

				if(i == 0) {
					substrings[i] = s.substring(j, j + maxChar);
					j += maxChar;
				} else {
				// if the first char in line is space
					String test = s.substring(j, j+1);
					if(!test.equals(" ")) { 
						substrings[i] = " " + s.substring(j, j + maxChar-1);
						j += maxChar-1;
					} else {
						substrings[i] = s.substring(j, j + maxChar);
						j += maxChar;
					}
				
				}
				
			}
			String empty = s.substring(j,j+1);
			String substring = s.substring(j);
			
			if(!empty.equals(" ")) {
				if (substring.length() < maxChar-1) {
					substrings[maxLines-1] = " " + s.substring(j);
				} else {
					substrings[maxLines-1] = " " + s.substring(j, j + maxChar-1);
				}
				
			} else {
				if (substring.length() < maxChar) {
					substrings[maxLines-1] = s.substring(j);
				} else {
					substrings[maxLines-1] = s.substring(j, j + maxChar);
				}
				
			}
			

			return substrings;
		}
		
		return null;
	}
	
	public static void maxLines(int maxLines) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "precipice in front wolves behind";
		
		String[] string = maxNumOfChar(test, 3, 10);
		

		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		
		

	}

}
