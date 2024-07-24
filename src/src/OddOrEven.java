import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even checker");
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("Number is Even");
        }else System.out.println("Number is 0 or odd");
    }
}
