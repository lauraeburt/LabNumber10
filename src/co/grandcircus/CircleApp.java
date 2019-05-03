package co.grandcircus;

import java.util.Scanner;





public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");

		while (true) {
			double inputRadius = Validator.getDouble(scan, "Enter a radius:");
			Circle circle = new Circle(inputRadius);
			System.out.println("circumference =  " + circle.getFormattedCircumference());
			System.out.println("Area =  " + circle.getFormattedArea());

			System.out.println("Would you like to continue? (y/n)");
			String s = scan.nextLine();
			if (s.charAt(0) == 'n') {
				System.out.println("Thanks!");
				break;
			} else {
				continue;
			}
		}
	}
}
