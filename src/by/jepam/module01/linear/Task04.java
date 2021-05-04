package by.jepam.module01.linear;

////Дано  действительное число R вида nnn.ddd. Поменять местами целую и дробную часть
public class Task04 {

	public static void main(String args[]) {
		double r = 121.127;
		double x = (r * 1000) % 1000 + (int) r / 1000.0;

		System.out.println(x);
	}
}
