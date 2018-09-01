import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		
		boolean success = false;        

	    do
	    {
	        System.out.println("Введите четырехзначное число");
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        
	        
	        if((x/10000) == 0 & (x/1000) >= 1)
	        	success = true;
	        
	        if ( success == true ) {
	        	sc.close();
	        	int a = x%10;
	            x = (x - a)/10;
	            int b = x%10;
	            x = (x - b)/10;
	            int c = x%10;
	            x = (x - c)/10;
	            int d = x%10;
	            System.out.println(a*1000 + b*100 + c*10 + d);
	        } else 
	            System.out.println("Введенное Вами число не является четырехзначным!");
	        
	    } while ( !success);
	}        
		
	}
         
		


