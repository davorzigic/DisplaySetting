import java.util.ArrayList;

public class TNationTaskV2 {

	/***
	 * 
	 * @param s
	 *            string inputed
	 * @param maxChar
	 *            num of chars that we want to split string
	 * @return returns array of splitted strings
	 */
	public static ArrayList<String> maxNumOfChar(String s, int maxChar, int maxLines) {

		// Cheking if we can fit number of 'maxLines' given
		int biggerThan = maxChar * maxLines;
		if (s.length() < biggerThan) {
			System.out.println("You have to enter less max lines.");
			return null;
		}

		ArrayList<String> substrings = new ArrayList<String>();

		if (s.length() == 0) {
			System.out.println("String is empty.");
			return null;
		} else if (s.length() < maxChar) {
			System.out.println("You have to enter less max number of chars");
		} else {

			int j = 0;

			for (int i = 0; i < maxLines - 1; i++) {

				if (i == 0) {
					substrings.add(s.substring(j, j + maxChar));
					j += maxChar;
				} else {
					// if the first char in line is space
					String test = s.substring(j, j + 1);
					System.out.println(test);
					if (!test.equals(" ")) {
						substrings.add(" " + s.substring(j, j + maxChar - 1));
						j += maxChar - 1;
					} else {
						substrings.add(s.substring(j, j + maxChar));
						j += maxChar;
					}

				}

			}
			String empty = s.substring(j, j + 1);
			String substring = s.substring(j);

			if (!empty.equals(" ")) {
				if (substring.length() < maxChar - 1) {
					substrings.add(" " + s.substring(j));
				} else {
					substrings.add(" " + s.substring(j, j + maxChar - 1));
				}

			} else {
				if (substring.length() < maxChar) {
					substrings.add(s.substring(j));
				} else {
					substrings.add(s.substring(j, j + maxChar));
				}

			}

			return substrings;
		}

		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "9:00 John Doe until 10 30 at Office";

		ArrayList<String> string = maxNumOfChar(test, 7, 3);

		System.out.println(string);
		
		for(String item : string) {
			System.out.println(item);
		}

	}

}
