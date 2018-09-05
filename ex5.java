import java.util.*;
public class ex5 {

	public static void main(String[] args) throws InterruptedException {

Random rand = new Random();
Random rand1 = new Random();
int a = rand.nextInt(9) + 1;
int b = rand1.nextInt(9) + 1;
int array[][] = new int[a][b];

for(int i =0; i <a; i++)
   {for(int j = 0; j < b; j++)
     {Random rand2 = new Random();
     int zn = rand2.nextInt(50);
     array[i][j] = zn;
     }
   } // заполнение массива

for(int i =0; i <a; i++)
   {for(int j = 0; j < b; j++)
      {System.out.print(array[i][j] + " ");
      }
   System.out.println();
   } // печать массива

System.out.println();

Thread.sleep(2000);

int c = 0;
int d = a - 1;
// меняем местами значения, если вo "внешнем" массиве более 1 эл-та
if (a!= 1) 
   {while(c < d) 
      {int e = b - 1;
	     for(int i = 0; i < b; i ++)
             {int buff = array[c][i];
              array[c][i] = array[d][e];
              array[d][e] = buff;
              e--;
             }
	    c++;
	    d--;
      };
      if(c == d)
        {int e = b - 1;
	    for(int i = 0; i < e; i ++)
           {int buff = array[c][i];
           array[c][i] = array[d][e];
           array[d][e] = buff;
           e--;
           }
        }
   }
// если во "внешнем" массиве 1 элемент:
else {int e = b - 1;
	  for(int i = 0; i < e; i ++)
         {int buff = array[c][i];
         array[c][i] = array[d][e];
         array[d][e] = buff;
         e--;
         }
     };

for(int i =0; i <a; i++) // печать
   {for(int j = 0; j < b; j++)
      {System.out.print(array[i][j] + " ");
      }
   System.out.println();
   };
}
}
