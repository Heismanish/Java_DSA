public class Strings{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,3};
        String name1 = "Anupriya Gupta";
        String name2 = "Anupriya Gupta";
         
        // new Object - created outside of string pool but inside heap.
        String name3 = new String("Anupriya Gupta"); 

   
        // comparison of strings:
        // 1."==" method
        System.out.println(name1 == name2); // true

        String name4 = new String("Manish");
        String name5 = new String("Manish");
        System.out.println(name4 ==name5);
        System.out.println(name4.equals(name5));
        

    }
}