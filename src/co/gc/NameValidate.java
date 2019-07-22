package co.gc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameValidate {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println(validName(scan));
	System.out.println(validEmail(scan));
	System.out.println(validPhoneNum(scan));
	System.out.println(validDate(scan));

	scan.close();
	}
	private static String validName(Scanner scan) {
		String nameValidity= "";
		System.out.println("Please enter a valid name: ");
		nameValidity = scan.nextLine();
		while (!Pattern.matches("[A-Z]{1}\\w*", nameValidity)) {
			System.out.println("Invalid name try again!");
			nameValidity = scan.nextLine();
		}
		return nameValidity;
	}
	private static String validEmail(Scanner scan) {
		String emailName= "";
		System.out.println("Please enter a valid email: ");
		emailName = scan.nextLine();
		while (!Pattern.matches("(?!.*\\.{2})^([a-z\\d!#$%&'*+\\-\\/=?^_`{|}~\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+(\\.[a-z\\d!#$%&'*+\\-\\/=?^_`{|}~\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+)*|\"((([ \\t]*\\r\\n)?[ \\t]+)?([\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x7f\\x21\\x23-\\x5b\\x5d-\\x7e\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0d-\\x7f\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]))*(([ \\t]*\\r\\n)?[ \\t]+)?\")@(([a-z\\d\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]|[a-z\\d\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-z\\d\\-._~\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]*[a-z\\d\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])\\.)+([a-z\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]|[a-z\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-z\\d\\-._~\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]*[a-z\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])\\.?$", emailName)) {
			System.out.println("Invalid email try again!");
			emailName = scan.nextLine();
		}
		return "Your email is valid";

	}
	private static String validPhoneNum(Scanner scan) {
		String phoneNum= "";
		System.out.println("Please enter a valid phone number ###-###-####: ");
		phoneNum = scan.nextLine();
		while (!Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phoneNum)) {
			System.out.println("Invalid phone number try again!");
			phoneNum = scan.nextLine();
		}
		return "Your phone number is valid";

	}
	private static String validDate(Scanner scan) {
		String dateCheck= "";
		System.out.println("Please enter valid date: ");
		dateCheck = scan.nextLine();
		while (!Pattern.matches("\\d{2}\\/\\d{2}\\/\\d{4}", dateCheck)) {
			System.out.println("Invalid date try agian!");
			dateCheck = scan.nextLine();
		}
		return "Your date is valid!";
	}
	
}
