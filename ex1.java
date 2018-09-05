import java.util.Random;
public class ex1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(6)+10;
		int fact = 1;
		for(int i = 1; i <= a; i++)
		{fact = fact*i;
	}
		System.out.println("Факториал " + a + " равен " + fact);

}
}
