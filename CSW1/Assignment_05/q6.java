public class q6 {
    public static void main(String[] args) {
        int count=0;
        int n1=18,n2=3;
        int t=n2;
        while(t<=n1){
            t=add(t,n2);
            count++;
        }
        System.out.println(n1+" divided by "+n2+" is "+count);
    }
    static int add(int num1, int num2){
        if(num2==0)
        	return num1;
        int sum=num1 ^ num2;
        int carry=(num1 & num2)<<1;
        return add(sum,carry);
    }
}
