public class Scope {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 9;

        // a and b cannot be used outside this main function.
        // a and b do not have any scope outside this function.

        {// values initialised in this block, will remain in this block.

            //int a = 87; // already initialised outside the block in the same method
                          // hence it can't be reinitialised.

            a = 98;    // but already initialised value in same method can be accessed and modified in this block.
            int c = 99;// like "c" can't be accessed outside this block.
        }
        int c = 87; // anything inside the block can be initialised outside the block
        System.out.println(a);
        //System.out.println(c); // c can't be accessed outside the block

        // Scoping in for loop
        for( int i = 0; i < 4; i++ ){
            System.out.println(i);
            int num = 90;
        }
        //System.out.println(i); // can't access anything initialised inside for loop.
    }

    static void marks(int marks ){
        int num = 89;
        // similarly, marks and num can't be accessed outside this function.
        System.out.println(num);
        System.out.println(marks);
    }
}
