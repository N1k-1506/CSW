package assignment02;
class Student<T>{
	T rollNo;
	String Name;
	int age;
	Student(T roll,String n,int a){
		rollNo=roll;
		Name=n;
		age=a;
	}
	public String toString() {
		return "Name: "+Name+", Age: "+age+", Roll Number: "+rollNo;
	}
}
public class q01 {

	public static void main(String[] args) {
		Integer roll=32;
		String roll2="E01";
		Student<Integer> s1=new Student<Integer>(roll,"Judo",21);
		Student<String> s2=new Student<String>(roll2,"Kungfu",19);
		System.out.println(s1);
		System.out.println(s2);
	}

}
