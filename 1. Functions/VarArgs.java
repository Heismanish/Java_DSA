import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varargs(3,6,8,4,5,9,12,14,11);
        multiple(3,5,"manish","dikshika");
    }
    static void varargs ( int ...a){ // " int ...v " is called variable length argument
                                     // it takes an array of integer input
                                     // it can be also used to take string or char or double input.

        System.out.println(Arrays.toString(a));
    }
    static void multiple(int a, int b , String ...v){
        System.out.println(a+" "+ b +" "+ Arrays.toString(v));
    }
    //static void let (int a ,String ...v, int b ){} // we can't use variable arguments in between,
                                                     // because we don't know how many inputs are there going to be in  variable argument
                                                     // hence we won't be able to pass a value to b.
}
