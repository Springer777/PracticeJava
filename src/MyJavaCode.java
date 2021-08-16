import java.util.Scanner;

public class MyJavaCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double number = scanner.nextInt();
        double sum = number;
        int counter = 0;
        double average = 0;
        int evenCounter = 0;
        int oddCounter = 0;

        while (number > 0) {
            number = scanner.nextInt();
            sum = sum + number;
            counter++;

            if (number%2==0){
                evenCounter++;
            }
            if (number%2!=0){
                oddCounter++;
            }

            if (number < 0) {
                System.out.println("Thanks, Bye!");
                sum = sum - number;
                average = sum/counter;
                break;
            }
        }


        System.out.println("The sum of the numbers = " + sum);
        System.out.println("The number of the numbers = " + counter);
        System.out.println("The average of the numbers = " + average);
        System.out.println("The number of even numbers = " + evenCounter);
        System.out.println("The number of odd numbers = " + oddCounter);
    }

}
