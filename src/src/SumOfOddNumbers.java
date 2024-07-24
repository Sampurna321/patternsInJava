import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        int i=0;
        while(number >= 1){
            if(number%2!=0) {
                i = i + number;
            }
            number--;
        }
        System.out.println(i);
    }
}
