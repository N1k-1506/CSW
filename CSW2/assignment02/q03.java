package assignment02;
public class q03 {
	public static void main(String[] args) {
		Car car1=new Car("Chiron","Blue",400.0);
		Car car2=new Car("Urus","Yellow",370.50);
		System.out.print(car1.compareTo(car2)==1? car2.toString():car1.toString());
	}
}
class Car implements Comparable<Car>{
	String Model;
	String Color;
	Double speed;
	
	Car(String m,String c,Double s){
		Model=m;
		Color=c;
		speed=s;
	}
	public String toString() {
		return "Model: "+Model+",Color: "+Color+",Speed: "+speed;
	}
	public int compareTo(Car carobj) {
	   return carobj.speed.compareTo(this.speed);
	}
}
