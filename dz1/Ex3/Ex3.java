import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("������� ����� ���������:");
	      double dl = sc.nextInt();
	      System.out.println("������� ������ ���������:");
	      double sh = sc.nextInt();
	      System.out.println("������� ������ ��������:");
	      double rad = sc.nextInt();
	      sc.close();
	      double diag = Math.sqrt(Math.pow(dl, 2) + Math.pow(sh, 2));
	      if(rad >= diag) 
	      System.out.println("�������� ������� ���������");
	      else System.out.println("�������� �� ������� ���������");

	}

}
