import java.util.Scanner;
public class q16 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter range lower and upper");
  int l=sc.nextInt(),u=sc.nextInt();
  System.out.print("Prime in range are ");
  for (int i = l; i <=u ; i++) {
    if(isPrime(i)) System.out.print(i+" ");
  }
  sc.close();  
 }
 static boolean isPrime(int a){
    if(a<=1) return false;
    for(int i=2;i<=Math.sqrt(a);i++)
        if(a%i==0) return false;
    return true;
 }   
}
