package by.jepam.module01.linear;

/*Дано натуральное число T, которое обозначает длительность прошедшего времени в секундах.
Вывести данное значение длительность в часах, минутах и секундах в следующей форме HHч.ММмин.SSсек.*/
public class Task05 {
	public static void main(String args[]) {
		int s = 10897;
		int hour = s / 3600;
		int minute = (s - (3600 * hour)) / 60;
		int second = (s - (3600 * hour) - (60 * minute));

		System.out.println(hour + "ч." + minute + "мин." + second + "сек.");
	}

}

