import java.util.Scanner;
public class leapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a year between 1582-2017");
		int year = in.nextInt();
		if (isLeapYear(year) == true) {
			System.out.println("It is a leap year :)");
		}else {
			System.out.println("It is not a leap year ):");
		}
	}
	public static boolean isLeapYear (int year) {
		boolean isLeapYear = true;
		if (year < 1582) {
			return isLeapYear = false;
		}else if (year % 4 == 0) {
			return isLeapYear = true;
		}else if (year % 100 == 0) {
			return isLeapYear = false;
		}else if (year % 400 == 0) {
			return isLeapYear = true;
		}
	}
}
