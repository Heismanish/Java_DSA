public class Recursion {
    public static void main(String[] args) {
        // waf that print hello world 5 times through single function.
        message();
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }

}
