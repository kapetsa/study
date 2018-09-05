import java.util.*;
public class ex6 {

	public static void main(String[] args) {
Random rand = new Random();
int a = rand.nextInt(15) + 5;
int array[] = new int[a];

Random rand1 = new Random();
int first = rand1.nextInt(100);
array[0] = first;
 for(int i = 1; i < a; i++)
	 metka:  {Random rand2 = new Random();
           int zn = rand2.nextInt(100);
           for(int j = 0; j < i; j++)
               {if(array[j] == zn)
               {  i--;
        	     break metka;
               }
                else  if(j + 1 == i)
        	     array[i] = zn;
               }
          };
       
for(int i = 0; i < a; i++)     
       {System.out.print(array[i] + " "); }    

System.out.println();

// ищем наибольшее значение
int max = 0;
int maxN = 0;
for(int i = 0; i < a; i++)
    {if (array[i] > max)
    	{max = array[i];
    maxN = i;}
    }
System.out.println("Наибольшее значение - " + max);


int min = max;
int minN = 0;
for(int i = 0; i < a; i++)
    {if (array[i] < min)
    	{min = array[i];
    minN = i;}
    }
System.out.println("Наименьшее значение - " + min);

int sum = 0;
if(maxN > minN)
   {for(int i = minN; i <= maxN; i++)
     sum = sum + array[i];
   }
else {for(int i = maxN; i <= minN; i++)
	 sum = sum + array[i];
     }
 System.out.println("Сумма всех чисел между ними (включительно) = " + sum);
 
	}
}
