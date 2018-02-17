import java.time.LocalDate;
import java.util.Scanner;

public class DateNTime {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
		
		System.out.println(month+""+ day+""+ year);
		//System.out.println(getDay(day,month,year));
	}
	public static void getDay(int d, int m, int y) {
		LocalDate lt = LocalDate.of(y, m, d);
		System.out.println(lt.getDayOfWeek());
		
	}

}
