package assignment02;
public class q06 {
	public static void main(String[] args) {
		Animal a1=new Animal("Tiger","Striped","wild");
		System.out.println("HashCode of 1 object : "+a1.hashCode());
		Animal a2=new Animal("Lion","Golden","wild");
		System.out.println("HashCode of 2 object : "+a2.hashCode());
	}
}
class Animal{
	String name,color,type;
	Animal(String n,String c,String t){
		name=n;
		color=c;
		type=t;
	}
	Animal(){}
	public int hashCode() {
		return (int)(Math.random()*12030)+143982;
	}
}
