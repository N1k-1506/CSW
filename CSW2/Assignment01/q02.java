class Rectangle{
	private int length,width;
	Rectangle(int l,int w){
		length=l;
		width=w;
	}
	Rectangle(){
		
	}
	int getLength() {
		return length;
	}
	int getWidth() {
		return width;
	}
	void setLength(int a) {
		length=a;
	}
	void setWidth(int a) {
		width=a;
	}
	int area() {
		return length*width;
	}
	int perimeter() {
		return 2*(length+width);
	}
}
public class q02 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(31,14);
		int area=r.area();
		int perimeter=r.perimeter();
		System.out.print("Area: "+area+" Perimeter: "+perimeter);
	}

}
