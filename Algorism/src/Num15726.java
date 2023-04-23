import java.util.Scanner;

public class Num15726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();

		double result1 = A * B / C;
		double result2 = A / B * C;

		double result = (result1 > result2) ? result1 : result2;

		System.out.print((int) result);
	}
}
