import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.");
        float a=sc.nextFloat();
        System.out.println("Enter second no.");
        float b=sc.nextFloat();
        float c=0.0f;
        if(b>a){c=b-a;}
        else{c=a-b;}
        if (c<1.0f) {
            System.out.println("Difference is less than 1 i.e "+c);
        }
        else{
            System.out.println("Difference is more than 1 i.e "+c);
        }
        sc.close();
    }
}
