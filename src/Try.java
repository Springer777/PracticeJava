import java.util.Scanner;

public class Try {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfPassengers, filledSeats, emptySeats = 0;

        System.out.print("Enter the number of the passengers: ");
        numberOfPassengers = scanner.nextInt();

        filledSeats = numberOfPassengers % 50;
        if (filledSeats==0){
            System.out.println("The number of empty seats in the last bus is 0");
        }
        else {
            emptySeats = 50 - filledSeats;
            System.out.println("The number of empty seats in the last bus is " + emptySeats);
        }
    }
}
