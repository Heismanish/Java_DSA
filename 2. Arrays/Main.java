public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Manish Gupta";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 34;
        int rno3 = 34;


        //Array : It is a collection of data types.
        // in java Array may not be internally continuous(even though it's definition says it's continuous) because:
        // In java array objects are stored in heap, and in JLS it's mentioned that
        // heap objects are not continuous, DMA(Dynamic Array Allocation) happens at the runtime.
        // HENCE, it completely depends on JVM whether array would be continuous internally or not.

        // syntax:
        //datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:

        int [] ros; // declaration of array: ros is getting defined in the stack memory.
        ros = new int[5];// initialisation: actually here object is being created in the heap memory.
                         // 5 is the size of array it's & important to provide size otherwise it will give an errror.


        int[] rnos = new int[4]; // 'new' is to create an object.
        // ^ here, int tells about the data type stored in array.
        // 4 is the size of array

        // or directly
        int [] rnos2 = {2,5,7,2,9,54,4}; // here internally JVM is doing the same thing as in above

        //indices of array:
        System.out.println(rnos2 [0]); // it will give 2 ,i.e., 0th element of array


        String [] arrstring = new String[4];
        System.out.println(arrstring[0]);// gives null because array is empty

        // null is a special "literal" which can only be assigned to non-primitive data type.
        // null is by default of what reference variable is pointing to.
        // int a = null; // gives error
        String p = null; // String being a non primitive can have a null value.



    }
}
