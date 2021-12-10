package DAY_17.NESTED_CLASS_DEMO.com.demo.test;
import DAY_17.NESTED_CLASS_DEMO.com.demo.model.Book;
import DAY_17.NESTED_CLASS_DEMO.com.demo.model.OuterClass;


public class TestComposition {

	public static void main(String[] args) {
		Book b=new Book(12,"test");
		b.display();
		Book.Lesson l=b.new Lesson(1,"Lesson1");
        l.dispLesson();
        OuterClass ob=new OuterClass();
        OuterClass.NestedClass nob=new OuterClass.NestedClass();
        nob.method();
	}

}
