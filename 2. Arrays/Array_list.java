import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList is used when we don't know the size.

        // Syntax;
        ArrayList<Integer> list = new ArrayList<>(10);
        //          ^ wrapper class are provided here (Integer,String, etc.)


        list.add(67);
        list.add(43);
        list.add(234);
        list.add(565);
        list.add(2432);
        list.add(353);
        list.add(23);
        list.add(64);
        list.add(42);
        list.add(277);
        list.add(5655);
        list.add(2332);
        list.add(333);
        list.add(24);

        // to check if an element is in the list or not.
        System.out.println(list.contains(765432));
        System.out.println(list);

        // to update value at 0th index to 99.
        list.set(0,99);
        System.out.println(list);

        // to remove an element at a particular index.
        list.remove(2);
        System.out.println(list);

       // input
       // for(int i = 0; i < 5; i++ ){
       //     list.add(in.nextInt());
       // }

        // get item at any index.
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

        // get last 5 item of list.
        for(int i = list.size()-5; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
