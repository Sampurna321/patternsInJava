import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = input.nextInt();
        System.out.print("Enter Time: ");
        int time = input.nextInt();
        System.out.print("Enter Rate: ");
        int rate = input.nextInt();
        System.out.println((principle*time*rate)/100);



    }
}
