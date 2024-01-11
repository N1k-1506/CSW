import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.");
        int a=sc.nextInt();
        System.out.println("Enter second no.");
        int b=sc.nextInt();
        int t=a,x=0;
        while(t!=0){
            x=t%100;
            t/=100;
        }
        t=b;
        x=x*100+t%100;
        System.out.println("The sum of first digits of "+a+" and last digits of "+b+" are "+x);
        sc.close();
    }
}
