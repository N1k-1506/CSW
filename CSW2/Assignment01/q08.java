interface Vehicle{
	abstract void accelerate();
	abstract void brake();
}
class CAR implements Vehicle{
	public void accelerate() {
		System.out.println("Car takes 100 seconds to achive 100 kmph");
	}
	public void brake() {
		System.out.println("It takes 5s to slow down from 100-0 kmph");
	}
	void accelerate(double speed,double duration) {
		System.out.println("At speed "+speed+" m/s it takes duration of "+duration+" seconds to reach 100kmph");
	}
}
class Bicycle implements Vehicle{
	public void accelerate() {
		System.out.println("Bicycle takes 100 seconds to achive 20 kmph");
	}
	public void brake() {
		System.out.println("It takes 10s to slow down from 20-0 kmph");
	}
	void accelerate(double speed,double duration) {
		System.out.println("At speed "+speed+" m/s it takes duration of "+duration+" seconds to reach 20kmph");
	}
}
public class q08 {

	public static void main(String[] args) {
		CAR c=new CAR();
		c.accelerate();
		c.accelerate(54.0,230.8);
		c.brake();
		Bicycle b=new Bicycle();
		b.accelerate();
		b.accelerate(20,97.4);
		b.brake();
	}

}
