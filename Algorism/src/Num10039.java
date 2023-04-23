import java.util.Scanner;

public class Num10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int men[] = new int[5];

		for (int i = 0; i < 5; i++) {
			men[i] = sc.nextInt();
		}

		int b_min = men[0];
		int bv_min = men[3];

		for (int i = 0; i < 3; i++) {
			if (b_min >= men[i])
				b_min = men[i];
		}
		for (int i = 3; i < 5; i++) {
			if (bv_min >= men[i])
				bv_min = men[i];
		}
		int min = (b_min + bv_min) - 50;
		System.out.println(min);
	}

}
