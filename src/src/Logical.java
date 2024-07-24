import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.println("Enter Your age");
        int age = input.nextInt();
        System.out.println("Enter Your Gender");
        String gender = input.next();
        if (age<5){
            System.out.println("Discount is 75%");
        }
        else if (gender.equals("female")) {
            System.out.println("Discount if 50%");
        }
        else if (age>60 && gender.equals("male")){
            System.out.println("Discount if 25%");

        }  else System.out.println("No Discount");

        input.close();
    }
}
