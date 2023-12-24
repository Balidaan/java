package app;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your two numbers : ");
		int n1 = obj.nextInt();
		int n2 = obj.nextInt();
		String op = obj.next();

		int cal;

		switch (op) {
		case "+":
			cal = n1 + n2;
			System.out.println("Here is the addition operation: " + cal);
			break;
		case "-":
			cal = n1 - n2;
			System.out.println("Here is the subtraction operation: " + cal);
			break;
		case "*":
			cal = n1 * n2;
			System.out.println("Here is the multiplication operation: " + cal);
			break;
		case "/":
			cal = n1 / n2;
			System.out.println("Here is the division operation: " + cal);
			break;
		}

	}

}
