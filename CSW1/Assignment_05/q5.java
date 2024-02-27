public class q5 {
    public static void main(String[] args) {
	int a=21,b=7;
	int prod=0;
	int t=a;
	for(int i=1;i<=b;i++){
	   prod=add(prod,t);
	   System.out.println(prod);
	}
	System.out.print("Product of "+a+" and "+b+" is: "+prod);
		
    }
    static int add(int num1, int num2){
        if(num2==0)
        	return num1;
        int sum=num1 ^ num2;
        int carry=(num1 & num2)<<1;
        return add(sum,carry);
    }
}
