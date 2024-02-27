public class q7 {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        System.out.println(square(x, y));
    }
    static int square(int x,int y){
        if(y==0)
         return 1;
        if(y==1)
        return x;
        return x*square(x, y-1);
    }
}
