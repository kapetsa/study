package ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

			
			Student st1 = new Student("Vasya", 2);
			Student st2 = new Student("Kolya", 1);
			Student st3 = new Student("Nina", 2);
			Student st4 = new Student("Nata", 3);
			Student st5 = new Student("Artem", 4);
			Student st6 = new Student("Inna", 5);
			Student st7 = new Student("Dasha", 1);
			Student st8 = new Student("Sergey", 4);
			Student st9 = new Student("Olya", 3);
			Student st10 = new Student("Anton", 5);

			Student[] arr = {st1, st2, st3, st4, st5, st6, st7, st8, st9, st10};

			List <Student> list1 = new ArrayList<>();
			for (int i =0; i <10; i++)
			{list1.add(arr[i]);
			};
			Iterator<Student> iterator = list1.iterator();
			while (iterator.hasNext()) {
				Student a = iterator.next();
			    if (a.getCourse() == 1)
			    { String b = a.getName() + " " + a.getCourse() + " kurs";
			    	System.out.println(b);

		}
	}


	}}