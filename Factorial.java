package solution;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		if (number >= 1 && number <= 2_000) {
			SearchFactorial(number);
		} else {
			System.out.println("Wrong number");
		}

		scan.close();

	}

	private static void SearchFactorial(int number) {
		switch (number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 6:
			System.out.println("3");
			break;
		case 24:
			System.out.println("7");
			break;
		case 120:
			System.out.println("5");
			break;
		case 720:
			System.out.println("6");
			break;
		default:
			System.out.println("There is no integer to be the factorial basis");
			break;
		}

	}

}
