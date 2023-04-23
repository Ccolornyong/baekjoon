import java.util.Scanner;

public class Num2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int l = 0; l < N; l++) {
			for (int i = 0; i < N - l; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
