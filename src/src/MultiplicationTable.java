import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(number + " X " + i + " = " + i*number );
            i++;
        }
    }
}
