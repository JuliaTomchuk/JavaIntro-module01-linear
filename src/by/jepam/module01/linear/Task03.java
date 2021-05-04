package by.jepam.module01.linear;

import java.util.Scanner;

//((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x)y
public class Task03 {

	public static void main(String[] args) {
		double x = readFromConsole();
		double y = readFromConsole();

		double a = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x) * y;
		System.out.println("a равно " + a);
	}

	public static double readFromConsole() {
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		System.out.println("Введите число");

		while (!var.hasNextDouble()) {

			var.next();
			System.out.println("Введите число�:");

		}
		return var.nextDouble();

	}
}
