
public class sum {
    public static void main (String[] args){
        double answer = average(4,3,6,1);
        System.out.println("The sum= " + answer);

    }

    public static double average (int num1, int num2, int num3, int num4){
        double sum = num1 + num2 + num3 + num4;
        return sum/4;
    }

}
