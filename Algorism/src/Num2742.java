import java.util.Scanner;

public class Num2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int number = N;

		for (int i = 0; i < N; i++) {
			System.out.println(number);
			number--;
		}
	}
}
