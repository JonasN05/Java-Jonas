package Arrays.Quersumme;

public class CrossSum03 {

    public static int[] Numbers = new int[CrossSum(false) + 1];

    public static void main(String[] args) {

        CrossSum(true);
        int highest01 = 0;
        int highest02 = 0;
        int highestNumber = 0;

        for (int i = 0; i < Numbers.length; i++){
            if (Numbers[i] == highestNumber){
                highest02 = i;
            }
            if (Numbers[i] > highestNumber) {
                highest01 = i;
                highestNumber = Numbers[i];
            }
        }

        if (highest01 == highest02 || highest02 == 0)
            System.out.println("Highest CrossSum: " + highest01);
        else
            System.out.println("Highest CrossSum/s: " + highest01 + ", " + highest02);
        System.out.println("Highest Number: " + highestNumber);
    }

    public static int CrossSum(boolean secondTry){
        int highestCrossSum = 0;
        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp = tmp / 10;
            }
            if(crossSum > highestCrossSum){
                highestCrossSum = crossSum;
            }
            if(secondTry){
                Numbers[crossSum]++;
            }
        }
        return highestCrossSum;
    }
}
