class Point{
	int X;int Y;
	Point(int X,int Y){
		this.X=X;
		this.Y=Y;
	}
	Point(){
		
	}
	void setPoint(int x,int y) {
		X=x;
		Y=y;
	}
	Point getPoint() {
		Point a=new Point(X,Y);
		return a;
	}
	Point Copy(Point a) {
		Point b=new Point(a.X,a.Y);
		return b;
	}
}
public class q03 {

	public static void main(String[] args) {
		Point a=new Point(4,5);
		Point b=new Point();
		b=b.Copy(a);
		a.setPoint(3,7);
		System.out.println(a.X+" "+a.Y);
		System.out.print(b.X+" "+b.Y);
	}

}
