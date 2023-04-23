import java.util.Scanner;

public class Num10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int num = 0;

		for (int i = 0; i < 5; i++) {
			int c = sc.nextInt();
			if (c == d) {
				num++;
			}
		}
		System.out.print(num);
	}
}
