import java.util.Scanner;
public class Ex2 
{
	public static void main(String[] args)
          {
		  Scanner sc = new Scanner(System.in);
	      System.out.println("������� �����: ");
	      int a = sc.nextInt();
	      sc.close();
	      
	      int b = a%1000;   //���������� �����
	      int c = a/1000;
	      if(b>=100 & c == 0)
	          System.out.println(a + " - ����������� �����");
	          else System.out.println(a + " - ������������� �����");  
	      
	      int d = a%10;
	      if(d == 7)
	          System.out.println("��������� ����� � ����� " + a + " - ����");
	          else System.out.println("��������� ����� � ����� " + a + " - �� ����");  
	      
          int f = a%2;
          if(f == 0)
              System.out.println(a + " - ������ �����");
              else System.out.println(a + " - �������� �����");    
	      }

}
	
