class Car{
	private String make,model;
	Car(String a,String b){
		make=a;
		model=b;
	}
	Car(){}
	void setModel(String a){
		model=a;
	}
	void setMake(String b){
		make=b;
	}
	String getModel(){return model;}
	String getMake(){return make;}
	void print() {
		System.out.println("Make: "+make+" Model: "+model);
	}
}
class CarTester{
	public static void main(String[] args) {
		Car myCar1=new Car("German","G-wagon");
		Car myCar2=new Car();
		myCar1.print();
		myCar2.print();
		myCar2.setMake("Indian");
		myCar2.setModel("Nexon");
		myCar1.print();
		myCar2.print();
	}
}
