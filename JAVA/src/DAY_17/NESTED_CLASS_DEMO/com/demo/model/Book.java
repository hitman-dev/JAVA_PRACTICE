package DAY_17.NESTED_CLASS_DEMO.com.demo.model;

public class Book {
	private int bid;
	private String bname;
	
	public class Lesson{
		private int lid;
		private String lname;
		
		public Lesson() {
			super();
		}

		public Lesson(int lid, String lname) {
			super();
			this.lid = lid;
			this.lname = lname;
		}

		public void dispLesson() {
			System.out.println(" Lesson id : "+lid+"lname : "+lname+"   "+bid);
			display();
		}
	}
	//private Lesson l;
	
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Book() {
		super();
	}
	public void display() {
		System.out.println("book id : "+bid+"Name : "+bname);
		
	}
	

}
