package lab16;

import java.util.Scanner;

public class Lab16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String keepGoing = "y";
		System.out.println("Let's locate some primes!\n");

		System.out.println("This application will find you any prime, in order, from first prime number on.");

		while (keepGoing.equalsIgnoreCase("y")) {
			int userNum = Validator.getInt(scan, "Which prime number are you looking for? ");
			int prime = getPrimes(userNum);

			System.out.println("\nThe number " + userNum + " prime is " + prime);

			keepGoing = Validator.getString(scan, "\nDo you to find another prime number? (y/n) ", "y", "n");
		}

		scan.close();
	}

	public static int getPrimes(int userPrime) {
		int primeCount = 0;
		int number;
		for (number = 2; primeCount < userPrime; number++) {
			if (isPrime(number)) {
				primeCount++;
			}
		}
		return number - 1;
	}

	public static boolean isPrime(int test) {
		for (int i = 2; i < test; i++) {
			if (test % i == 0) {
				return false;
			}
		}
		return true;
	}

}
