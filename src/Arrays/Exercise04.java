package Arrays;

public class Exercise04 {

    public static void main(String[] args) {

        int order = 0;
        int[] numbers = {8,3,2,22,8,1};

        for (int i = 0; i < numbers.length; i++){

            for (int j = 0; j < numbers.length - 1; j++ ) {

                if (numbers[j] >= numbers[j+1]){
                    order = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = order;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
