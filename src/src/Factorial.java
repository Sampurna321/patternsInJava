import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int i=1;
        while(number>0){
            i=i*number;
            number=number-1;

        }
        System.out.println(i);
    }
}
