package DSA1.Array.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
