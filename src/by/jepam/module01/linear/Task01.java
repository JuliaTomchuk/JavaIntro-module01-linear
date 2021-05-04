package by.jepam.module01.linear;

import java.util.Scanner;

//z=((a-3)*b/2)+c
public class Task01 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;
		a = readFromConsole();
		b = readFromConsole();
		c = readFromConsole();
		z = ((a - 3) * b / 2) + c;
		System.out.println(" z  равно " + z);

	}

	public static double readFromConsole() {
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		System.out.println("Введите число");

		while (!var.hasNextDouble()) {

			var.next();
			System.out.println("Введите число:");

		}
		return var.nextDouble();

	}
}