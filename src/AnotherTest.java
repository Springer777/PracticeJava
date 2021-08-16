import java.util.Scanner;

public class AnotherTest {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times for the method: ");
        int number = scanner.nextInt();
        int i = 0;

        while (i<number){
            exampleMethod();
            i++;
        }
    }

    public static void exampleMethod(){
        System.out.println("Mo na mobl333");
    }
}
