import java.util.Scanner;

public class IT24103291Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;

        while (true) {

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println(
                    "Invalid input. Please enter a positive integer or -99 to terminate"
                );
                continue;
            }

            sumOfSquares = sumOfSquares + (number * number);
            count++;
        }

        double rms = Math.sqrt(sumOfSquares / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);
    }
}