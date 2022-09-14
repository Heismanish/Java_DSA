import java.util.Scanner;

public class Rguments {
    public static void main(String[] args) {
        // arguments are used when user
        // wants to input value while calling the function.
  /*
        int ans = sum3( 20, 30);
        System.out.println(ans);
        */

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name: ");
        String namee = in.nextLine();
        String personalised = myGreet(namee);
        System.out.println(personalised);
    }

   /*

    static int sum3( int a, int b ){
        int sum = a + b;
        return sum;

   */






    // Parameters are used to pass the value of numbers
    // when you are calling the method in main()
    static String myGreet(String name){
        String greeting = "how are you " + name;
        return greeting;

    }
}
