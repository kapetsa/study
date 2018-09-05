import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(1000);
		 int s = 0; 
		for (int i = 1; i <= a; i++)
		{  int b = a % i;
		if ( b == 0 )
			s++; 
		}
		
		if (s == 2)
			 System.out.println("Число " + a + " является простым");
		else System.out.println("Число " + a +" не является простым");
		}

	}



