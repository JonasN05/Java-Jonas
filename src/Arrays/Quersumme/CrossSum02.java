package Arrays.Quersumme;

public class CrossSum02 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            String stringNumber = Integer.toString(i);
            char[] numbers = stringNumber.toCharArray();

            int result = 0;
            for (int j = 0; j < numbers.length; j++) {
                result += Character.getNumericValue(numbers[j]);
            }

            int rest = result%7;

            if (rest==0){
                System.out.println("Nummer: " + i + "  Arrays.Quersumme: " + result);
            }


        }
    }
}
