public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        // it doesn't swap value
  //      int temp = a;
  //      a = b;
  //      b = temp;

        // for primitive data types like int, byte, double,char etc.
        // it's just pass by value
        swap(a, b);
        System.out.println(a + " " + b);


        String name = "Manish Gupta";

        //for object and variables it's pass by value of that reference
        // i.e., 2 reference pointing to same object.
        changeName(name);
        System.out.println(name);


    }

   // function to swap numbers:
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }


    // function to swap name:
    static void changeName( String naam){
        // here a new object Dikshika Aggarwal is being created.
        // since a string is immutable it is not being modified like array(ChangeValue).

        naam = "Dikshika Aggarwal";
    }
}
