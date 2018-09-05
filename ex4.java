import java.util.Random; 
public class ex4 {

	public static void main(String[] args) {
Random rand1 = new Random();
Random rand2 = new Random();
int a = rand1.nextInt(10)+10;
int b = rand2.nextInt(5)+5;
int[][]marks = new int[a][b];
for (int i = 0; i < a; i++)
{for (int j = 0; j < b; j++)
{Random rand3 = new Random();
int c = rand3.nextInt(5) + 1;
marks[i][j] = c;
System.out.print(marks[i][j] + " ");
}
System.out.println();
}
System.out.println();

int d = 0;
for (int i = 0; i < a; i++)
{for (int j = 0; j < b; j++)
{if(marks[i][j] > d)
	d = marks[i][j];
}
}
System.out.println("Самая высокая оценка - " + d + ", находится в следующих позвициях:");

System.out.println();

for (int i = 0; i < a; i++)
{for (int j = 0; j < b; j++)
{if(marks[i][j] == d)
	System.out.println("[" + i + "][" + j + "]");}
}
System.out.println();
System.out.println("Первая оценка - " + marks[0][0]);
System.out.println("Последняя оценка - " + marks[a-1][b-1]);
	}
}

