public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //waf that takes in number and prints it
        // print first 5 numbers: 1 2 3 4 5
        // function calls goes into stack memory
        print1(1);
    }
    static void  print1(int n){
        // base condition - that ends the program
        if( n == 5 ){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // this is tail recursion
        // is the last function to get called
        print1(n+1); // function calling itself
    }

}
