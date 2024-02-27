class College{
	String CollegeName,CollegeLoc;
	College(String cn,String cl){
		CollegeName=cn;
		CollegeLoc=cl;
	}
	College(){
		
	}
}
class Student{
	String studentName;
	int studentId;
	College abc;
	
	Student(String a,int b,College x){
		studentName=a;
		studentId=b;
		abc=x;
	}
	void displayStudentInfo() {
		System.out.println("Name: "+studentName+" Id: "+studentId+" College name: "+abc.CollegeName+" College Location: "+abc.CollegeLoc);
	}
}
public class q05 {

	public static void main(String[] args) {
		College a=new College("Xyz","Bbsr");
		College b=new College("abcd","Ctc");
		Student s1=new Student("Roasted egg",6409,a);
		s1.displayStudentInfo();
		Student s2=new Student("Smashed Potato",6547,b);
		s2.displayStudentInfo();
	}

}
