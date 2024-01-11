public class q9 {
    public static void main(String[] args) {
        int n=1319;
        if(ispalindrome(n))
            System.out.println(n+" is a palindrome number ");
        else
            System.out.println(n+" is not a palindrome number ");
    }
    static boolean ispalindrome(int x){
        int t=x,rev=0;
        while(t!=0){
            rev=rev*10+t%10;
            t/=10;
        }
        if (x==rev)
            return true; 
        return false;
    }
}
