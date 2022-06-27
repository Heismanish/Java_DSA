import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner take = new Scanner (System.in);
        // while loop;
        // used when we don't know how many times loop will run
        int b = take.nextInt();
        int c = take.nextInt();

        while( b < c ){
            // here we don't know how many times the loop will run
            // because it depends on users wish.
            System.out.println(b);
            b++;
        }

        while (b != 3){
            System.out.println(b);
            b++;
        }



        // do while loop:
        // Do while loop is used when we want to execute a block at least once.
        int a = take.nextInt();
        do{
            System.out.println(a); // this will print "a" at least one time
                                   // no matter what integer is assigned to "a"
            a++;
        }while( a < 3 );
        System.out.println();
    }
}
