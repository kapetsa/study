import java.util.Scanner;
public class Ex2 
{
	public static void main(String[] args)
          {
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Введите число: ");
	      int a = sc.nextInt();
	      sc.close();
	     
	      if(a > 99 && a <1000)
	          System.out.println(a + " - трехзначное число");
	          else System.out.println(a + " - нетрехзначное число");  
	      
	      int d = a%10;
	      if(d == 7)
	          System.out.println("Последняя цифра в числе " + a + " - семь");
	          else System.out.println("Последняя цифра в числе " + a + " - не семь");  
	      
          int f = a%2;
          if(f == 0)
              System.out.println(a + " - четное число");
              else System.out.println(a + " - нечетное число");    
	      }

}
	
