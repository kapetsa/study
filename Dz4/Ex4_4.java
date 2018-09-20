package ex4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex4_4 {

	public static void main(String[] args) {
	int []arr1 = {1,2,3,5,7,8};
	Set <Integer> set1 = new HashSet<>();
	for (int i =0; i <6; i++)
	{set1.add(arr1[i]);};
	
	
	int []arr2 = {1,6,9,14,3,7};
	Set <Integer> set2 = new HashSet<>();
	for (int i =0; i <6; i++)
	{set2.add(arr2[i]);};
	
    print(set1);
   
    print(set2);
    
    System.out.println("Результат работы union:");   
    
    
    print(union(set1, set2));
    
    System.out.println("Результат работы intersect:");
	
	
	print(intersect(set1, set2));
	
	}
	
	private static void print (Collection <Integer> r){
		Iterator<Integer> iterator = r.iterator();

		while (iterator.hasNext())
		{
		 Integer it = iterator.next();
		 System.out.print(it);
		 
		}
		System.out.println();
	};
	
	private static Set union(Set s1, Set s2) {
		Set<Integer> set3 = new HashSet<>(s1); 
        set3.addAll(s2);
		return(set3);
	}
	
	private static Set intersect(Set s1, Set s2) {
		Set <Integer> set4 = new HashSet(s1);
		set4.retainAll(s2);
		return(set4);
	}
}
	
