package DAY_18.JAVA_8_FEATURES.com.demo.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import DAY_18.JAVA_8_FEATURES.com.demo.beans.Product;


public class TestCollectorsMethod {

	public static void main(String[] args) {
		/*List<Product>plist=new ArrayList<>();
		plist.add();
		plist.add();
		plist.stream().forEach();*/
		
		
		 /*Stream<Product> sprod=Stream.of(new  Product("chair",3000.00), new  Product("Table",5000.00),new  Product("Shelf",2000.00));
		 List<Product> lst2=sprod.filter(p->p.getPrice()>2000).collect(Collectors.toList());
		 System.out.println(lst2);
		 
		 
		 Stream<Product> sprod1=Stream.of(new  Product("chair",3000.00), new  Product("Table",5000.00),new  Product("Shelf",2000.00));
		 Map<String, Double> pmap=sprod1.collect(Collectors.toMap(p->p.getName(),p->p.getPrice()));
		 
		 
		 Stream<Product> sprod2=Stream.of(new  Product("chair",3000.00), new  Product("Table",5000.00),new  Product("Shelf",2000.00));
		 Map<String, Double> pmap1=sprod2.collect(Collectors.toMap(Product::getName,Product::getPrice));
		 sprod.forEach(System.out::println);*/
		 
		 Stream<Product> sprod3=Stream.of(new  Product("chair",3000.00), new  Product("Table",5000.00),new  Product("Shelf",2000.00));
		 Stream<Product> s=sprod3.filter(p->{System.out.println("in filter"+p.getName());
		                                            return p.getPrice()>2000;});//.collect(Collectors.toList());
		 System.out.println("To call filter use terminating Stream function");
		 List<Product> lst3=s.collect(Collectors.toList());
		 
		 System.out.println(lst3);
		 
		 Stream<Product> sprod4=Stream.of(new  Product("chair",3000.00), new  Product("Table",5000.00),new  Product("Shelf",2000.00));
		 /*for(Product p:plist) {
			 System.out.println(p);
		 }
		 sprod4.forEach(System.out::println);*/
		 /*for(Product p:plist) {
			 if (p.geName().equals("chair"))
			 System.out.println(p);
		 }
		 //plist.stream().filter();*/
		 
		 
		 sprod4.filter(p->p.getName().equals("chair")).forEach(System.out::println);
		 

	}

}
