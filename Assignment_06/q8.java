import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter boolean:");
        String a=sc.next();
        Boolean check=Boolean.parseBoolean(a);
        System.out.println(check);
        sc.close();
    }
}
