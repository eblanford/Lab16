package lab16;

import java.util.Scanner;

public class Validator {

	public static String getString(Scanner sc, String prompt, String opt1, String opt2) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			s = sc.next(); // read user entry
			sc.nextLine(); // discard any other data entered on the line
			if (s.equalsIgnoreCase(opt1)) {
				isValid = true;
			} else if (s.equalsIgnoreCase(opt2)) {
				isValid = true;
			} else {
				System.out.println("Invalid input, please try again!");
			}
		}
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

}