
import java.util.Scanner;

public class Algorism {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 반복할 횟수 입력
		int a = sc.nextInt();

		// 숫자 입력
		String num = sc.next();

		// 합 담을 곳
		int sum = 0;

		// 입력한 a만큼 반복
		for (int i = 0; i < a; i++) {

			sum += num.charAt(i) - '0';

		}

		System.out.println(sum);

	}

}