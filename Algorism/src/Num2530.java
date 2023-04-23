import java.util.Scanner;

public class Num2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		C = C + D;

		if (C < 60) {
			System.out.print(A + " " + B + " " + C);
		} else {
			B += C / 60;
			C = C % 60;
			if (B >= 60) {
				A += B / 60;
				B = B % 60;
			}
			if (A >= 24)
				A = A % 24;
			System.out.print(A + " " + B + " " + C);
		}

	}

}
