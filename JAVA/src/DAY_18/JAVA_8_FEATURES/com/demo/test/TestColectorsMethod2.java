package DAY_18.JAVA_8_FEATURES.com.demo.test;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import DAY_18.JAVA_8_FEATURES.com.demo.beans.Person;
import DAY_18.JAVA_8_FEATURES.com.demo.beans.Person.Gender;


public class TestColectorsMethod2 {
    public static void main(String[] args) {
    	Person p1=new Person("Rajan",20, Gender.MALE);
		Person p2=new Person("Yash",65, Gender.MALE);
		Person p3=new Person("Ashu",26, Gender.FEMALE);
		Person p4=new Person("Deepa",27, Gender.FEMALE);
	
		Stream<Person> ps=Stream.of(p1,p2,p3,p4); 
		Map<Gender,List<Person>> map=ps.collect(Collectors.groupingBy(Person::getGender));
		System.out.println(map);
		
		Stream<Person> ps1=Stream.of(p1,p2,p3,p4); 
		Map<Gender,Long> map1=ps1.collect(Collectors.groupingBy(Person::getGender,Collectors.counting()));
		System.out.println(map1);
		
     }
}
