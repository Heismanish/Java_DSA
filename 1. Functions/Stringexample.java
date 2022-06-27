public class Stringexample {
    public static void main(String[] args) {
        String message = greet();

        System.out.println(message);

        System.out.println( welcome() );
    }

    static String greet(){
        String greeting = "Hello, how are you?";
        return greeting;
    }

    static String welcome() {
        String welcome = "Welcome to my codebase. ";
        return welcome;
    }
}
