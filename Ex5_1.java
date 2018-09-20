package Ex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Ex5_1 {

	public static void main(String[] args) {
ArrayList <Integer> arr = new ArrayList<>();
LinkedList <Integer> link = new LinkedList<>();
TreeSet <Integer> tree = new TreeSet<>();
HashSet <Integer> hash = new HashSet<>();

System.out.println("����� ���������� � ArrayList ����� " + add(arr));
System.out.println("����� ���������� � LinkedList ����� " + add(link));
System.out.println("����� ���������� � TreeSet ����� " + add(tree));
System.out.println("����� ���������� � HashSet ����� " + add(hash));
System.out.println("����� �������� �� ArrayList ����� " + remove(arr));
System.out.println("����� �������� �� LinkedList ����� " + remove(link));
System.out.println("����� �������� �� TreeSet ����� " + remove(tree));
System.out.println("����� �������� �� HashSet ����� " + remove(hash));
System.out.println("����� ������ �� ArrayList ����� " + contains(arr));
System.out.println("����� ������ �� LinkedList ����� " + contains(link));
System.out.println("����� ������ �� TreeSet ����� " + contains(tree));
System.out.println("����� ������ �� HashSet ����� " + contains(hash));

Map<String, HashMap> hashMap = new HashMap<String, HashMap>();

HashMap<Integer, Collection> a = new HashMap<Integer, Collection>();
a.put((int) (add(arr)+ remove(arr) + contains(arr)), arr);
hashMap.put("arrayList", a);

HashMap<Integer, Collection> b = new HashMap<Integer, Collection>();
a.put((int) (add(link)+ remove(link) + contains(link)), link);
hashMap.put("linkedList", b);

HashMap<Integer, Collection> c = new HashMap<Integer, Collection>();
a.put((int) (add(tree)+ remove(tree) + contains(tree)), tree);
hashMap.put("treeSet", c);

HashMap<Integer, Collection> d = new HashMap<Integer, Collection>();
a.put((int) (add(hash)+ remove(hash) + contains(hash)), hash);
hashMap.put("hashSet", d);

  }

public static long add(Collection<Integer> a) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
        a.add(i);
    }
    long time = System.currentTimeMillis() - start;
    return time;
}

public static long remove(Collection<Integer> a) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 5000; i++) {
        a.remove(i);
    }
    long time = System.currentTimeMillis() - start;
    return time;
}

public static long contains(Collection<Integer> a) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 5000; i++) {
        a.contains(i);
    }
    long time = System.currentTimeMillis() - start;
    return time;

}}
