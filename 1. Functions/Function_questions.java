import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Function_questions {
    public static void main( String [] arg ){

        Scanner in = new Scanner(System.in);

       // 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        /*
        System.out.println("Enter number 1: ");
        int a = in.nextInt();
        System.out.println("Enter number 2: ");
        int b = in.nextInt();
        System.out.println("Enter number 3: ");
        int c = in.nextInt();

        minimum(a,b,c);
        maximum(a,b,c);*/

        // 2.Define a program to find out whether a given number is even or odd.
        /*System.out.println("Enter number: ");
        int a = in.nextInt();
        even_odd(a);*/

        // 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote
       /* System.out.println("Enter age: ");
        int age = in.nextInt();
        voter(age);*/

        // 4. Write a program to print the sum of two numbers entered by user by defining your own method.
       /* System.out.println("Enter numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a,b);*/

        // 5. Define a method that returns the product of two numbers entered by user.
        /*System.out.println("Enter numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        prod(a,b);*/

        // 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        /*System.out.println("Enter radius: ");
        Double a = in.nextDouble();
        circum_area(a);*/

        // 7. Define a method to find out if a number is prime or not.
       /* System.out.println("Enter number: ");
        prime2(in.nextInt());*/

        // 8. Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:
        /*System.out.println("Enter marks: ");
        grade(in.nextDouble());
*/
        // 9.Write a function that returns all prime numbers between two given numbers.
       /* System.out.println("Enter numbers");
        primenums(in.nextInt(), in.nextInt());*/

        // 10. Write a function to check if a given triplet is a Pythagorean triplet or not
        /*System.out.println("Enter numbers");
        pgtTriplet(in.nextInt(), in.nextInt(),in.nextInt());*/

        // 11. Write a function that returns the sum of first n natural numbers.
        System.out.print("n = ");
        sumOfn(in.nextInt());
    }

    static void minimum(int a , int b, int c){
        int min = a;
        if( a > b){
            min = b;
        }
        if( min > c){
            min = c;
        }
        System.out.println("minimum is: " + min);
    }

    static void maximum(int a, int b, int c){
        int max = a;
        if( a < b){
            max = b;
        }
        if( max < c){
            max = c;
        }
        System.out.println("maximum is: " + max);
    }

    static void even_odd (int a){
        if (a % 2 == 0 ){
            System.out.println(a +" is even");
        } else System.out.println(a +" is odd");
    }
    static void voter(int a){
        if (a >= 18 ){
            System.out.println("candidate is eligible to vote");
        } else System.out.println("candidate is not eligible to vote");
    }
    static void sum(int a,int b){
        int c = a+b;
        System.out.println("sum is: " + c);
    }
    static void prod(int a, int b){
        long c = a*b;
        System.out.println("product is: " + c);
    }
    static void circum_area(Double a){
        double circum = 2 * 22 * a/7;
        double area = 22 * a * a / 7;
        System.out.println("circumference is "+circum );
        System.out.println("area is "+area );

    }
    static void prime(int a){
       boolean b = false;
       for (int i = 2 ; i <= sqrt(a); i++){
           if( a%i == 0 ){
               b =true;
           }
       }
       if(b == false){
           System.out.println(a + " is prime");
       } else System.out.println( a + " is not prime");
    }

    static void prime2( int a ){
        int n = a/2, m = 0;
        if( a <=0 ){
            System.out.println( a +" is not prime");
        } else {
            for (int i = 2; i <= n; i++ ){
                if( a % i == 0 ){
                System.out.println(a + " is not prime");
                m =1;
                break;
                }
            }
        }
        if( m == 0){
        System.out.println(a +" is prime");
        }


    }
    static void grade(Double p){
       if ( 91 <= p && p <= 100 ){
           System.out.println("Grade: AA");
       } else if ( 81 <= p && p <= 90){
           System.out.println("Grade: AB");
       } else if( 71 <= p && p <= 80){
           System.out.println("Grade: BB");
       } else if ( 61 <= p && p <= 70 ){
           System.out.println("Grade: BC");
       }else if ( 51 <= p && p <= 60){
           System.out.println("Grade: CD");
       } else if ( 41 <= p && p <= 50){
           System.out.println("Grade: DD");
       }
       else if ( p <= 40){
           System.out.println("fail");
       }

    }
    static void primenums(int minLimit, int maxLimit){
        //int a = minLimit+1;
        boolean isPrime = true;
        while ( minLimit < maxLimit){
            for(int i = 2; i <= sqrt(minLimit); i++ ){
                if( minLimit % i == 0 ){
                    isPrime = false;
                    if (isPrime == false){
                        break;
                    }
                }else isPrime = true;
            }
            if ( isPrime == true ){
                System.out.println(minLimit);
            }
            minLimit++;
        }
    }

    static Integer square(int a){
        return (a*a);
    }
    static void pgtTriplet(int a, int b, int c){
        if( square(a) + square(b) == square(c)){
            System.out.println(true);
        } else  if( square(b) + square(c) == square(b)){
            System.out.println(true);
        } else if( square(a) + square(c) == square(b)){
            System.out.println(true);
        } else System.out.println(false);;
    }

    static void sumOfn(int n){
        /*int sum = 0;
        for (int i = 0; i <=n; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);*/
        System.out.println("sum of first "+n +" natural number is: " + n * (n+1)/2);
    }
}

