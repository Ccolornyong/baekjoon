import java.util.Scanner;

public class Num10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int sum = A + B + C;
		if (sum == 180) {
			if (A == 60 && B == 60)
				System.out.print("Equilateral");
			else if (A == B || A == C || C == B) {
				System.out.print("Isosceles");
			} else
				System.out.print("Scalene");
		} else
			System.out.print("Error");
	}
}