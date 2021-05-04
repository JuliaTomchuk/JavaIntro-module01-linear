package by.jepam.module01.linear;

import java.util.Scanner;

//Для данной области составить программу, которая печатает true, если точка() принадлежит закрашенной области и false в противном случае;
public class Task06 {
	public static void main(String args[]) {
		double x = readFromConsoleX();
		double y = readFromConsoleY();
		if (x <= 4 && x >= -4 && y <= 4 && y >= -3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static double readFromConsoleX() {
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		System.out.println("Введите координату по оси x");

		while (!var.hasNextDouble()) {

			var.next();
			System.out.println("Введите координату по оси x");

		}
		return var.nextDouble();

	}

	public static double readFromConsoleY() {
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		System.out.println("Введите координату по оси y");

		while (!var.hasNextDouble()) {

			var.next();
			System.out.println("Введите координату по оси y");

		}
		return var.nextDouble();

	}
}
