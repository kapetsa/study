import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Введите количество секунд:");
	      int sec = sc.nextInt();
	      sc.close();
	     int min = sec/60;
	     int secRest = sec%60;
	     int hours = min/60;
	     int minRest = min%60;
	     int days = hours/24;
	     int hoursRest = hours%24;
	     int weeks = days/7;
	     int daysRest = days%7;
	     System.out.println(sec + "сек - это " + min + "мин и " + secRest + "сек");
	     System.out.println(sec + "сек - это " + hours + "ч " + minRest + "мин и " + secRest + "сек");
	     System.out.println(sec + "сек - это " + days + "дн " + hoursRest + "ч " + minRest + "мин и " + secRest + "сек");
	     System.out.println(sec + "сек - это " + weeks + "нед " + daysRest + "дн " + hoursRest + "ч " + minRest + "мин и " + secRest + "сек");
	}

}
