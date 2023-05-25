package com.Java8Features;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

class Product
{
	public int id;
	public String name;
	public long price;
	public Product(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}

public class CollectorsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> product=new ArrayList<>();

		Product p1=new Product(111,"Hp laptop",60000);
		Product p2=new Product(222,"Dell laptop",52000);
		Product p3=new Product(333,"Acer laptop",45000);
		Product p4=new Product(444,"Lenovo laptop",30000);
		Product p5=new Product(555,"Apple laptop",80000);
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		product.add(p5);
		
		Double sum=product.stream().collect(Collectors.summingDouble((p)->p.price));
		System.out.println(sum);
		Double avg=product.stream().collect(Collectors.averagingDouble((p)->p.price));
		System.out.println(avg);
		Long count=product.stream().collect(Collectors.counting());
		System.out.println(count);
		
		Optional<Product> maxProduct=product.stream()
				                            .collect(Collectors.maxBy(Comparator.comparingDouble(p->p.price)));
		System.out.println(maxProduct.get().price);
		Set<Product> pro=product.stream()
				                .map(p->p)
				                .collect(Collectors.toSet());
		pro.forEach((x)->System.out.println(x.id +" "+x.name+" "+x.price));
		
		Map<Integer,String> pro1=product.stream()
				                        .map(p->p)
				                        .collect(Collectors.toMap(p->p.id,p->p.name));
		System.out.println(pro1);
	}

}
