import java.util.Scanner;

public class Num10808 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] a = new int[26];

		for (int i = 0; i < s.length(); i++) { // 받은 문자를 잘라 배열 이름으로 표시
			int num = s.charAt(i);
			++a[num - 97]; // 나오면 숫자를 추가함
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
