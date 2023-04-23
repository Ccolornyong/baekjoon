import java.util.Scanner;

public class Num2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int P = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			int news_P = sc.nextInt();
			int LP = L * P;
			System.out.print(news_P - LP + " ");
		}
	}

}