import java.util.Scanner;

public class Num5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int AA = A / C;
		int BB = B / D;

		if (A % C != 0)
			AA = AA + 1;
		if (B % D != 0)
			BB = BB + 1;

		if (AA > BB) {
			System.out.print(L - AA);
		} else
			System.out.print(L - BB);
	}

}
