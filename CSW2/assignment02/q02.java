package assignment02;
public class q02 {
public static void main(String[] args) {
Book b1=new Book("Jungle mai mangal","JEE87",430);
Book b2=new Book("Jungle","JOU92",430);
System.out.println(b1);
System.out.println(b2);
System.out.print("Is price of Book 1&2 are same: "+(b1.equals(b2)?"Yes":"No"));
} 
}
class Book{
String bookID;
String bookName;
Integer price;
Book(String bookName,String bookID,int price){
this.bookName=bookName;
this.bookID=bookID;
this.price=price;}
public String toString() {
return "Book Name: "+bookName+", Book ID: "+bookID+", Price: "+price;}
public boolean equals(Book a) {return a.price.equals(this.price);}}
