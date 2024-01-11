public class q4 {
    public static void main(String[] args) {
        long n=2732;
        System.out.println("Number: "+ n+" "+Long.toBinaryString(n));
        long rev=reverse(n);
        System.out.print("Reversed no. "+rev+" "+Long.toBinaryString(rev));
    }
    static long reverse(long n){
      long a=n;
      long t=0;
      while(a!=0){
        t=(t<<1)^(a & 1);
        a=a>>1;
      }
      return t;
    }
}
