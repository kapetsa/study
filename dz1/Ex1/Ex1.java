import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("������� ���������� ������:");
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
	     System.out.println(sec + "��� - ��� " + min + "��� � " + secRest + "���");
	     System.out.println(sec + "��� - ��� " + hours + "� " + minRest + "��� � " + secRest + "���");
	     System.out.println(sec + "��� - ��� " + days + "�� " + hoursRest + "� " + minRest + "��� � " + secRest + "���");
	     System.out.println(sec + "��� - ��� " + weeks + "��� " + daysRest + "�� " + hoursRest + "� " + minRest + "��� � " + secRest + "���");
	}

}
