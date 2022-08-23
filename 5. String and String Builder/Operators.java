import java.util.*;


public class Operators{
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // returns sum of ASCII values of a and b.
        System.out.println("a" + "b"); // retuns conacatenated ab
        System.out.println((char)('a' + 25 ));
        
        // when an integer is concatenated to a String then the Integer is converted to its wrapper class.
        System.out.println("a" + 1);  // same as "a" + 1
        // integer will be converted to Integer that will call toString()

        System.out.println("Manish" + new ArrayList<>());
        System.out.println("Manish" + new Integer(22));

        // In java conacatenation works for String and primitive only.
        //System.out.println(new ArrayList<>() + new Integer(22)); // will give error because Array is an complex datatype.
        // but we can concatenate it if we have at least one String
        System.out.println(""+new ArrayList<>() + new Integer(22));

        // this is operator overloading and it's the only oporator(+) that is intentionally overloaded in java to support string concatenation.
        // in other language we can use other operators to concatenate string and different complex datatype
         
    }
}