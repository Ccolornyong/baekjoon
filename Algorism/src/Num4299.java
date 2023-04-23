import java.util.Scanner;

public class Num4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int sub = sc.nextInt();

		if (sum != 0 || sub != 0) {
			int M, A;
			M = (sum - sub) / 2;
			A = sum - M;

			if (M + A == sum && (M - A == sub || A - M == sub) && M >= 0 && A >= 0) {
				if (M > A)
					System.out.print(M + " " + A);
				else
					System.out.print(A + " " + M);
			} else
				System.out.print("-1");
		} else
			System.out.print("0 0");
	}
}
