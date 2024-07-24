import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = input.nextInt();
        if (number>=1){
            System.out.println("Number is positive");
        } else if (number<=-1) {
            System.out.println("Number is negative");
        } else System.out.println("Number is 0");

    }

}
