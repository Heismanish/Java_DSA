import java.util.Scanner;

public class Armstrongnum {
    // to determine that a number is armstrong or not.
    public static void main(String[] args) {
        Scanner take  = new Scanner(System.in);
        int a = take.nextInt();
        boolean val = arms(a);
        System.out.println(val);

      // to print all 3 digit Armstrong numbers.
        for (int i=100; i< 1000; i++){
            if(arms(i)){
                System.out.println(i+" ");
            }
        }
    }
    static int power(int digit){
        int p = digit*digit*digit;
        return p ;
    }

    static boolean arms(int num) {
        int sum = 0;
        int orig = num;
        while (num > 0) {
            int rem = num % 10;
            int cube = power(rem);
            sum += cube;
            num /= 10;
        }
        if (orig == sum) {
            return true;
        } return false;

    }
}
