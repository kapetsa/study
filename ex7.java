import java.util.Random;
public class ex7 {

	public static void main(String[] args) {
Random rand = new Random();
int n = rand.nextInt(17)+3;
int array[][] = new int[n][n];
for (int i = 0; i < n; i++)
{for (int j = 0; j < n; j++)
	array[i][j] = 0;
}

int c = 0;
int d = n - 1;
while(c <= d)
{ int e = c;
int f = d;
while(e <= f)
{ array[c][e] = 1;
array[c][f] = 1;
array[d][e] = array[c][e];
array[d][f] = array[c][f];
e++;
f--;
}	
	
	c++;
	d--;
	
}
for (int i = 0; i < n; i++)
{for (int j = 0; j < n; j++)
	{System.out.print(array[i][j] + " ");
}
System.out.println();
}

	}	
}
