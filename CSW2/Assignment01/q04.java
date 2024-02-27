class Laptop{
	private int model,price;
	void setModel(int s) {
		model=s;
	}
	void setPrice(int p) {
		price=p;
	}
	public String toString() {
		return "Model: "+model+" Price: "+price;
	}
}
public class q04 {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setModel(2019);
		l.setPrice(3045000);
		System.out.print(l);
	}

}
