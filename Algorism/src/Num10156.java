import java.util.Scanner;

public class Num10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();

		if (K * N < M) {
			System.out.print(0);
		} else {
			System.out.print(K * N - M);
		}
	}

}
