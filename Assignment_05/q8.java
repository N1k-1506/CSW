public class q8 {
    public static void main(String[] args) {
        int a=-245;
        System.out.println("Reverse "+reverse(a));
    }
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev =rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
}
