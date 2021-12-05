package DAY_16.COMPOSITION_RELATION_DEMO;

public  class Book {
	private int bkid;
	private String bname;
	//Lesson ob;
	public Book() {
		bkid=10;
		bname="test";
	}
	public void m1() {
		System.out.println("in m1");
	}
	///only nested classes can be static classes
	// static classes can access only static members of outer class
	static class Lesson{
		private int lid;
		private String lname;
		public Lesson(int lid,String Lname) {
			this.lid=lid;
			this.lname=lname;
		}
		public void m2() {
			System.out.println("in m2");//+bkid);
			//m1();
		} 
		
	}

}
