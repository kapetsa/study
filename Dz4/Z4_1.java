package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Z4_1 {

	public static void main(String[] args) {
		Integer myArray[] = new Integer[10];
		for(int i = 0; i <10; i++)
		{Random rand = new Random();
		myArray[i] = rand.nextInt();
		System.out.println(myArray[i]);
		}
		
	List<Integer> myList = new ArrayList<>();	
	myList = Arrays.asList(myArray);
	
	System.out.println("**************************");

	
	System.out.println(myList);

	}

}
