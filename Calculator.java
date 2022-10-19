import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please input an operation");
		String operation = scnr.next();
		System.out.println("Please input your first number");
		double x = scnr.nextDouble();
		System.out.println("Please input your second number");
		double y = scnr.nextDouble();
		
		switch (operation) {
		case "add":
			System.out.println(x + " + " + y + " = " + add(x, y));
			break;
		case "subtract":
			System.out.println(x + " - " + y + " = " + subtract(x, y));
			break;
		case "multiply":
			System.out.println(x + " * " + y + " = " + multiply(x, y));
			break;
		case "divide":
			System.out.println(x + " / " + y + " = " + divide(x, y));
			break;
		case "power":
			System.out.println(x + " ^ " + y + " = " + power(x, y));
			break;
		case "root":
			System.out.println(x + " ^ (1/" + y + ") = " + root(x, y));
			break;
		}
	}
	
	public static double add (double x, double y) {
		return x + y;
	}
	
	public static double subtract (double x, double y) {
		return x - y;
	}

	public static double multiply (double x, double y) {
		return x * y;
	}

	public static double divide (double x, double y) {
		return x / y;
	}
	
	public static double power (double x, double y) {
		return Math.pow(x, y);
	}
	
	public static double root (double x, double y) {
		return Math.pow(x, 1/y);
	}	
	
}
