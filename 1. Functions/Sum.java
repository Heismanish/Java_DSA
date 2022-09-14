import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int ans = sum2(); // sum2 has a value of "sum"
        System.out.println("sum is: " + ans);

    }

    // return the value
    /*
    Syntax:
      access_modifier return_type name (){
          // body
          return statement;
      }
   */
    static int sum2(){ // here return type is "int"
                       // hence it will return an int only.
        Scanner take = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter number 1 : ");
        num1 = take.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = take.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }



// return type is "void" , which means we don't want any value to be returned
// we just want the function to run w/o any return value

    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter number1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
        // it will not work with a return statement
        // as it's return data type is void.
    }



}
/* SYNTAX:

        return_type name (){
            // body
            return statement;
        }
         */