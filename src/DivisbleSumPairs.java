import java.util.Scanner;
import java.util.ArrayList;

/*public class DivisbleSumPairs {
    public static void main (String[] args){
        divisibleSumPairs();

    }

    private static void divisibleSumPairs() {
        int n;
        int [] ar = new int [1000];
        int k;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        for (int x=0; x<1000; x++){
            ar[x] = scanner.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if ((ar[i] + ar[j]) % k ==0){
                    System.out.println(ar[i] + ", " + ar[j]);
                    count++;
                }
            }
        }
        System.out.println("The number of the pairs is " + count);
    }

} */

import java.util.Scanner;
import java.util.ArrayList;

public class DivisbleSumPairs {
    public static void main (String[] args){
        divisibleSumPairs();

    }

    private static void divisibleSumPairs() {
        int n;
        ArrayList<Integer>ar = new ArrayList<Integer>();
        int k;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        for (int i=0; i<n; i++){
            ar.add(scanner.nextInt());
        }


        for (int i=0; i<ar.size(); i++){
            for (int j=i+1; j<n; j++){
                if ((ar.get(i) + ar.get(j)) % k ==0){

                    count++;
                }
            }
        }
        System.out.println(count);
    }

}

