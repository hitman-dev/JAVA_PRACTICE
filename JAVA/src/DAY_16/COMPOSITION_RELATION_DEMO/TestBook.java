package DAY_16.COMPOSITION_RELATION_DEMO;

public class TestBook {
public static void main(String[] args) {
	//if Lesson is nonstatic class
	/*Book b=new Book();
	Book.Lesson l=b.new Lesson(12,"lesson1");*/
	
	//iff Lesoon is static class
	Book.Lesson ob=new Book.Lesson(12,"aaa");
}
}
