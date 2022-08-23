import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Manish Kumar gupta";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("t"));
        System.out.println(name.trim());
        System.out.println("   manish  k".trim());
        System.out.println("  manish  p ".strip());
        System.out.println(Arrays.toString(name.split(" ")));



    }
}
