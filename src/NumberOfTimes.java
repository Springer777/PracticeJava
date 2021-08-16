public class NumberOfTimes {
    public static void main(String[] args){
        //untilNumber(5);
        divisibleByThree(2,10);

    }

    public static void untilNumber(int numberOfTimes){
        int i = 1;
        while(numberOfTimes+1>i){
            System.out.println(numberOfTimes);
            numberOfTimes--;
        }

    }

    public static void divisibleByThree(int beginningNumber, int endingNumber){
        int i=0;
        for( i =beginningNumber; i<endingNumber+1; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
