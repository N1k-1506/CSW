package assignment02;
class Student1 implements Comparable<Student1>{
	String name;
	Integer rn,totalmark;
	Student1(String n,int r,int m){
		name=n;
		rn=r;
		totalmark=m;
	}
	public int compareTo(Student1 obj) {
		return (obj).rn.compareTo(rn);
	}
}
public class q04 {

	public static void main(String[] args) {
		Student1 st[]=new Student1[3];
		st[0]=new Student1("hog",12,780);
		st[1]=new Student1("Wog",14,670);
		st[2]=new Student1("Frog",13,800);
		Student1 obj=new Student1("Goog",21,609);
		int i=0;
		for(i=0;i<st.length;i++) {
			if(st[i].compareTo(obj)==0) {
				System.out.print("Object found at "+i+" index");
				break;
			}
		}
		if(i==st.length) System.out.print("Object not found");
	}

}
