package maxmonth;

import java.util.Scanner;

public class MaxMonth {

	private static final int[] maxday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, };

//당일 최대일을 배열로 준비

//	if문
//	public int MaxdayOfMonth(int month) {
//		if (month == 1) {
//			return 31;
//		}
//		if (month == 2) {
//			return 28;
//		}
//		if (month == 3) {
//			return 31;
//		}
//		if (month == 4) {
//			return 30;
//
//		}
//	}
//	case문
//	public int MaxdayOfMonth(int month) {
//		switch(montch){
//			case1:return 31;
//		case2:return28;
//		
//			case3:return 31;}
//		}

	public int MaxdaysOfMonth(int month) {
		return maxday[month - 1];
	}

	public static void main(String[] args) {
		String PROMPT="month>";
		// 입력준비
		Scanner scanner = new Scanner(System.in);
		MaxMonth Max = new MaxMonth();
		System.out.println("반복횟수를 입력해주세요");
		int repeat = scanner.nextInt();
		for (int i = 0; i < repeat; i++) {

			System.out.println("달을 입력해주세요");
//int month에 입력치 입력
			System.out.println(PROMPT);
			int month = scanner.nextInt();

			System.out.printf("%d월은 %d일까지 있습니다.\n", month, Max.MaxdaysOfMonth(month));

		}
		scanner.close();
		System.out.println("bye!bye!");
	}
}
