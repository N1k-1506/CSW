import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        int t=a;
        int count=0;
        while (t!=0) {
            if(t%2==1)
                count++;
            t/=2;
        }
        if ((count%2)==0){
            System.out.println("Even parity of "+a+"["+Integer.toBinaryString(a)+"] is 0");
        }
        else{ 
            System.out.println("Even parity of "+a+"["+Integer.toBinaryString(a)+"] is 1");
        }
        sc.close();
    }
}
