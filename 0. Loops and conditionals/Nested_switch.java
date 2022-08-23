import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        String department = in.next();
       /*  switch (empID){
            case 1 :
                System.out.println("Manish Kumar Gupta");
                break;
            case 2 :
                System.out.println("Deepak Kumar");
                break;
            case 3 :
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
                }
                break;
                default:
                    System.out.println("Enter correct EmpID")
        } */

        // BETTER Way

        switch (empID) {
            case 1 -> System.out.println("Manish Kumar Gupta");
            case 2 -> System.out.println("Deepak Kumar");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
