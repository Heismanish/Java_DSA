import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Scanner;

public class Previous_Questions {
    public static void main(String[] arg) {
        Scanner take = new Scanner(System.in);

        // Fibonacci series
        /*
        System.out.println("Enter number Of terms : ");
        int a = take.nextInt();
        fibo(a);
        */


        //Subtract the Product and Sum of Digits of an Integer:
     /*   int num = take.nextInt();
        prodminussum(num);
      */


        // Input a number and print all the factors of that number (use loops).
   /*     int number = take.nextInt();
        factor(number);
    */

        // Take integer inputs till the user enters 0 and print the sum of all numbers
      /*  int number = take.nextInt();
        sumofAll(number);
      */

        // Take integer inputs till the user enters 0 and print the largest number from all
        //largest(take.nextInt());


        // Factorial Program In Java
        //factorial(take.nextInt());

        // Calculate Average Of N Numbers
        //average(take.nextInt());

        // Power In Java
        /*System.out.println("Enter number:");
        int a = take.nextInt();
        System.out.println("Enter power of this number:");
        int b = take.nextInt();;
        power( a , b);*/

        // Armstrong Number In Java:
        //System.out.println("Enter number: ");
        //Armstrong(take.nextInt());

        // Find nPr.
       /* System.out.println("Enter n: ");
        int n = take.nextInt();
        System.out.println("Enter r: ");
        int r = take.nextInt();
        nPr( n, r );*/

        // Find nCr.
        /*System.out.println("Enter n: ");
        int n = take.nextInt();
        System.out.println("Enter r: ");
        int r = take.nextInt();
        nCr( n, r );*/

        // Reverse A String In Java
        /*System.out.println("Enter string ");
        String str = take.nextLine();
        reverse(str);*/

        // Find if a number is palindrome or not.
       /* System.out.println("Enter number:");
        int a = take.nextInt();
        palindrome(a);*/

        // HCF Of Two Numbers Program
       /* System.out.println("Enter numbers: ");
        int n = take.nextInt();
        int m = take.nextInt();
        hcf(n,m);*/

        // LCM Of two num
      /*  System.out.println("Enter numbers: ");
        int n = take.nextInt();
        int m = take.nextInt();
        lcm(n,m);*/

        // Perfect Number In Java
        /*System.out.println("Enter number: ");
        int n = take.nextInt();
        perfect(n);*/

        // Check Leap Year Or Not
        /*System.out.println("Enter number: ");
        int n = take.nextInt();
        leap(n);*/

        // Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.

        kunal();
    }

    static void fibo(int n) {
        int a = 0, b = 1, c;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    static void prodminussum(int n) {
        int prod = 1, sum = 0, a, diff;
        while (n > 0) {
            a = n % 10;
            //b = n / 10;
            prod *= a;
            sum += a;
            n /= 10;
        }
        diff = prod - sum;
        System.out.println(diff);
    }

    static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void sumofAll(int n) {
        int sum = n;
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            if (a > 0) {
                sum += a;
            } else break;
        }
        System.out.println(sum);
    }

    static void largest(int n) {
        int a;
        int large = Integer.MIN_VALUE;
        if (n > large) {
            large = n;
        }
        Scanner in = new Scanner(System.in);
        while (true) {
            if (n != 0) {
                a = in.nextInt();
                if (a != 0) {
                    int b = in.nextInt();
                    if (b > large) {
                        large = b;
                    } else break;
                }
            } else break;
        }
        System.out.println(large);
    }

    static Integer factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        //System.out.println(fact);
        return fact;
    }

    static void average(int n) {
        Scanner in = new Scanner(System.in);
        int sum = n, i = 0, a = n;
        while (true) {
            if (a != 0) {
                a = in.nextInt();
                sum += a;
                ++i;
            } else break;
        }
        System.out.println(sum / i);
    }

    static void power(int a, int b) {
        int powered = 1;
        for (int i = b; i > 0; i--) {
            powered *= a;
        }
        System.out.println(a + " to the power " + b + " is: " + powered);
    }

    static Integer noOFDigit(int n) {
        int digits = 0, num = n;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }

    static void Armstrong(int n) {
        int digit = noOFDigit(n);
        int sum = 0, a = 0, prod = 1, b;
        if (digit == 1) {
            System.out.println("it is a Armstrong number");
        }
        while (true) {
            if (n > 0) {
                a = n % 10;
                b = n / 10;
                for (int i = 0; i < digit; i++) {
                    prod *= a;
                }
                sum += prod;
                prod = 1;
                a = b;
                n = b;

            } else break;
        }
        System.out.println("Number is Armstrong");
    }

    static void nPr(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(n - r);
        System.out.println(nfact / rfact);
    }

    static void nCr(int n, int r) {
        int nfact = factorial(n);
        int nmrfact = factorial(n - r);
        int rfact = factorial(r);
        System.out.println(nfact / (rfact * nmrfact));
    }

    static void reverse(String str) {
        String s = str.replaceAll("//s", "");
        int l = str.length();
        for (int i = l - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }

    static void palindrome(int a) {
        int pal = 0;
        while ( a > 0) {
            int b = a % 10;
            pal = pal*10+b;
            a /= 10;
        }
        System.out.println(pal);
        System.out.println(pal == a);
    }

    static void hcf( int n , int m){
        int min, rem, hcf = 0;
       /* if( n > m){
        min = m;
        rem = n;
        } else {
            min = n;
            rem = m;
        }

        for( int i = 1; i<= min; i++){
            if( min % i ==0 && rem % i == 0 ){
                hcf = i;
            }
        }*/

        // better code
        for(int i = 1 ; i <= n || i <= m; i++){
            if( n % i ==0 && m % i == 0 ){
                hcf = i;
            }
        }
        System.out.println(hcf);

    }

    static void lcm(int m ,int n){

        int max = (n > m) ? n : m ; //ternary operator "?" gives true,  ":" gives false
        while(true ){
            if (max % m == 0 && max % n == 0){
                System.out.println(max);
                break;
                }
            max++;
        }
    }

    static void perfect(int n){
        int i, sum = 0;
        for(i = 1; i < n; i++){
            if ( n % i == 0 ){
                sum += i;
            }
        }
        System.out.println(sum == n);
    }

    static void leap(int n){
        boolean leap = false;
        if ( n % 4 == 0){
            if(n % 100 == 0 ){
                if(n % 400 == 0){
                    leap = true;
                } else leap = false;
            } else leap = true;
        } else leap = false;
        System.out.println(leap);
    }
    static void kunal(){
        int days = 0;
        for (int i =1; i <= 31;i++ ){
            if(i % 2 == 0){
                days++;}
        }
        System.out.println("Kunal can go out"+ days +"days");
    }
}


