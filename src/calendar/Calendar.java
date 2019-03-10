package calendar;

public class Calendar {
	private static final int[] maxday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, };
	private static final int[] LEAPmaxday = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}

	public int MaxdaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAPmaxday[month - 1];
		} else {
			return maxday[month - 1];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println("  SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		int maxday = MaxdaysOfMonth(year, month);

		for (int i = 1; i <= maxday; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
			
		}System.out.println();
	}

}
