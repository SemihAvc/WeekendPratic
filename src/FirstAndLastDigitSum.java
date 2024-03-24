public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int number1 = 1234567;
        int number2 = -45897;
        int number3 = 874521;

        System.out.println("Sum of first and last digits of " + number1 + ": " + getFirstAndLastDigitSum(number1));
        System.out.println("Sum of first and last digits of " + number2 + ": " + getFirstAndLastDigitSum(number2));
        System.out.println("Sum of first and last digits of " + number3 + ": " + getFirstAndLastDigitSum(number3));
    }

    public static int getFirstAndLastDigitSum(int number) {

        number = Math.abs(number);


        int lastDigit = number % 10;

        int firstDigit = 0;
        while (number >= 10) {
            number /= 10;
        }
        firstDigit = number;


        return firstDigit + lastDigit;
    }
}
