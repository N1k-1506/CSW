import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int a=sc.nextInt(),t=a,count=0;
        while(t!=0){
            int x=t%10;
            if(x%2==0)
                count++;
            t/=10;
        }
        System.out.println("Number of even digits in "+a+" is :"+count);
        sc.close();
    }
}
