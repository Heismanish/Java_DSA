public class Shadowing {

    // Shadowing in Java is the practice of using variables in overlapping scopes with the same name
   // where the variable in low-level scope overrides the variable of high-level scope.

   static int x = 90; // this x is shadowed by the x in line 11.
    // static makes things object independent
    // here x is object independent, hence can be used in entire Shadowing class

    // object dependent things can't be used inside object independent things.
    public static void main(String[] args) {
        System.out.println(x); // this will output 90

        int x ; // new x has been declared
                // Shadowing starts at declaration.
                // this class variable has shadowed x in line 4

        //System.out.println(x); // here it shows an error because we can't use a uninitialised variable

        x = 10; // new x has been initialised
        System.out.println(x); // this will output 10

        fun();
    }

    static void fun(){
         System.out.println(x);
     }

     // Shadowing doesn't works for methods.
}
