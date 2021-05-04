package by.jepam.module01.linear;

import java.time.LocalTime;

/*Дано натуральное число T, которое обозначает длительность прошедшего времени в секундах.
Вывести данное значение длительность в часах, минутах и секундах в следующей форме HHч.ММмин.SSсек.*/
public class Task05 {
	public static void main(String args[]) {
		int s = 10897;
		System.out.println(LocalTime.ofSecondOfDay(s));
	}

}
