import java.util.Scanner;

public class Num2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];

		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		int mid = 0;
		for (int i = 0; i < 3; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}

		for (int i = 0; i < 3; i++) {
			if (arr[i] < max) {
				if (arr[i] > min)
					mid = arr[i];
			}
		}
		System.out.print(min + " " + mid + " " + max);
	}

}
