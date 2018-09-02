import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
	Random rand = new Random();
	int a = rand.nextInt();
	int b = Math.abs(a%100);
	if (b >= 10 & b <= 20)
		System.out.println(a + " рублей");
	else {  int c = Math.abs(a%10);
	       if(c == 0 || c == 5 || c == 6 || c == 7 || c == 8 || c == 9 )
	    	   System.out.println(a + " рублей");
	    	   else {if(c == 1) 	 
	    		   System.out.println(a + " рубль");
	    	   else System.out.println(a + " рубля");
	    	   }
	}

	}

}
