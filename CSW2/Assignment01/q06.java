abstract class LibraryResource{
	private String name,author;
	LibraryResource(String a,String b){
		name=a;
		author=b;
	}
	void setName(String a) {
		name=a;
	}
	void setAuthor(String a) {
		author=a;
	}
	String getName() {
	return name;	
	}String getAuthor() {
		return author;
	}
	void displayDetails() {
		System.out.print("Name: "+name+" Author: "+author);
	}
}

class Book extends LibraryResource{
	int pageCount;
	Book(int pc,String n,String au){
		super(n,au);
		pageCount=pc;
	}
	void setName(int a) {
		pageCount=a;
	}
	int getPageCount() {
		return pageCount;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println(" Page Count: "+pageCount);
	}
}

class Magazine extends LibraryResource{
	String issueDate;
	Magazine(String isd,String n,String au){
		super(n,au);
		issueDate=isd;
	}
	void setName(String a) {
		issueDate=a;
	}
	String getPageCount() {
		return issueDate;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println(" Issue date: "+issueDate);
	}
}

class DVD extends LibraryResource{
	String duration;
	DVD(String d,String n,String au){
		super(n,au);
		duration=d;
	}
	void setName(String a) {
		duration=a;
	}
	String getPageCount() {
		return duration;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println(" Duration : "+duration);
	}
}



public class q06 {
	public static void main(String[] args) {
		Book b=new Book(450,"Maths","R D sharma");
		b.displayDetails();
		Magazine m=new Magazine("Jun 23","Times of india","Zudio");
		m.displayDetails();
		DVD d=new DVD("18 mins","Parsite","Jinx");
		d.displayDetails();
	}

}
