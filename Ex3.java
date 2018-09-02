import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Введите длину отверстия:");
	      double dl = sc.nextInt();
	      System.out.println("Введите ширину отверстия:");
	      double sh = sc.nextInt();
	      System.out.println("Введите радиус картонки:");
	      double rad = sc.nextInt();
	      sc.close();
	      double diag = Math.sqrt(Math.pow(dl, 2) + Math.pow(sh, 2));
	      if(rad >= diag) 
	      System.out.println("Картонка закроет отверстие");
	      else System.out.println("Картонка не закроет отверстие");

	}

}
