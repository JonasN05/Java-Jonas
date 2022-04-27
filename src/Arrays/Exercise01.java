package Arrays;

public class Exercise01 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int result = 0;

        for(int i = 0; i<numbers.length; i++){
            result = result + numbers[i];
            System.out.println(result);
        }

    }
}
