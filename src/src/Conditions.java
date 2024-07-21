import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input= new  Scanner (System.in);
        System.out.println("Welcome to driving license test ");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("You are eligible to get license");
        }
        else {
            System.out.println("Try again after 18 years old");
        }

    }
}
