import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int a=sc.nextInt();
        if (isPrime(a)) {
            System.out.println(a+" is a prime no.");
        }
        else{
            System.out.println(a+" is not a prime no.");
        }
        sc.close();
    }
    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false;
        return true; 
    } 
}
