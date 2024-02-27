/**
 * q1
 */
public class q1 {

    public static void main(String[] args) {
        int a=2,count=0;
        while (a!=0) {
            if(a%2==1)
                count++;
            a/=2;
        }
        System.out.println("No. of bits of value 1 is "+count);
    }
}