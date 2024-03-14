package assignment02;
class Student2 implements Comparable<Student2>{
	String name;
	Integer rn,totalmark;
	Student2(String n,int r,int m){
		name=n;
		rn=r;
		totalmark=m;
	}
	public int compareTo(Student2 obj) {
		return obj.rn.compareTo(rn);
	}
	public String toString() {
		return "Name: "+name+", Roll: "+rn+", Total mark: "+totalmark;
	}
}
public class q05 {

	public static void main(String[] args) {
		Student2 st[]=new Student2[4];
		st[0]=new Student2("hog",12,780);
		st[1]=new Student2("Wog",14,670);
		st[2]=new Student2("Frog",13,800);
		st[3]=new Student2("Goog",21,609);
		for(int i=0;i<st.length;i++) {
			for(int j=1;j<st.length;j++ ) {
				if(st[j-1].compareTo(st[j])==-1) {
					Student2 t=st[j];
					st[j]=st[j-1];
					st[j-1]=t;
				}
			}
		}
		for(Student2 a:st) System.out.println(a); 
	}

}
