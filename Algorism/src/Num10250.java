import java.util.Scanner;

public class Num10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int f, l;

		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			f = (N % H); // 층 구하기
			if (N < H) {
				f = N;
			}

			l = (N / H);
			if (f == 0) { // 호수 구하기
				f = H;
			}

			if (N % H != 0) { // 나눠 떨어질 때 빼고는 +1
				l = l + 1;
			}

			String ff = Integer.toString(f);
			String ll = Integer.toString(l);

			if (l >= 10) {
				// 호수가 한자리 일때
				System.out.println(ff + ll);
			} else
				System.out.println(ff + 0 + ll);
		}
	}

}
