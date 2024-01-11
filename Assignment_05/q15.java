public class q15 {
    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
        for (int i = 2; i < n; i++){
            if (n % i == 0) 
                return false;
        }
        return true;
    } 
    public static void main(String[] args) {
        int n=0,count=0;
        while (count<100) {
            n++;
            if(isPrime(n))
                count++;
        }
        System.out.println("100 th prime number is "+n);
    }
}