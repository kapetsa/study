import java.util.Random;
public class ex3 {

	public static void main(String[] args) {
Random rand = new Random();
int a = rand.nextInt(100);
int b = 0;
for(int i = 1; i <= (a*3); i++)
{if(i%3 == 0)
	b = b + i;
}
System.out.println("Сумма первых " + a + " чисел, делящихся на 3 без остатка, равна " + b);

	}

}
