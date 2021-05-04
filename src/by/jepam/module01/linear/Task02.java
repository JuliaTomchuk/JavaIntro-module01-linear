package by.jepam.module01.linear;

//(b+ Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a,3)*c + Math.pow(b,-2)
public class Task02 {

	public static void main(String args[]) {
		double a = 5.0;
		double b = 2.0;
		double c = 3.0;
		double x;
		x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println(x);
	}

}
