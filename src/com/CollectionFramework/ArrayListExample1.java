package com.CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		list.add(0,1);
		System.out.println(list);
		
		List<Integer> list1 =new ArrayList<>();
		
		list1.add(60);
		list1.add(70);
		
		list.addAll(list1);
		
		System.out.println(list);
		
		list.ensureCapacity(20);
		System.out.println(list.get(5));
		System.out.println(list.isEmpty());
		
		Iterator<Integer> itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println(list.lastIndexOf(list1));
		System.out.println(list.toArray());
		System.out.println(list.clone());
		System.out.println(list.contains(50));
		System.out.println(list.containsAll(list1));
		list.remove(0);
		System.out.println(list);
		System.out.println(list.removeAll(list1));
		System.out.println(list);
		
		
		list.removeIf(x -> x > 40);//predicate method
        System.out.println(list);
        
        
        
        list.replaceAll(u-> u.sum(list.get(0), list.get(1)));//unary operator
        
      	System.out.println(list);
	}
        
}
