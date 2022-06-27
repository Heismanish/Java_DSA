import java.util.Scanner;

public class Questions {
    // Find if a number is prime or not
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        int a = take.nextInt();
        boolean b = isPrime(a);
        System.out.println( b);
    }

    static boolean isPrime(int n){
        if ( n <= 0){
            return false;
        }

        int c = 2;
        while( c*c <= n){
            if ( n % c == 0){
                return false;
            }
            c++;
        }
        if( c*c > n){
            return true;
        }
        return false;
    }
}
