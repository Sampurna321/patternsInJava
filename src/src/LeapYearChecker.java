import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap year checker");
        System.out.print("Enter a year:");
        int year = input.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }else if (year%400==0){
                        System.out.println("Leap Year");
        }
        else System.out.println("Not leap year");
    }
}
