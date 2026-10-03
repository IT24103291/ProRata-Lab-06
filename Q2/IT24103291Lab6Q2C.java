import java.util.Scanner;

public class IT24103291Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 1;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = input.nextInt();

            sum = sum + numbers[i - 1];
            i++;
        }
		
		System.out.println();
		
        System.out.print("The numbers you entered are: ");

        i = 0;

        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
		
        double average = sum / 10.0;

        System.out.println();
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}