import java.util.Arrays;

public class Overloading {

    //Overloading allows different methods to have the same name, but different signatures
    // where the signature can differ by the number of input parameters or type of input parameters or both
    // overloading is related to compile time(static) polymorphism.

    public static void main(String[] args) {
        fun(5);
        fun("manish");
 // at compile time it is determined that which fun will be called.
        int ans = sum(4,6);
        System.out.println(ans);

        demo(5,4,234,234,23);
        demo("manish", "dikshika" );

        //demo(); // here it will give error because it won't know which method is being called.
                  // a overloaded method can not be empty
    }

    static void demo (int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }

    static int sum(int a, int b){
         return a + b ;
    }

    static void fun(int a ){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
