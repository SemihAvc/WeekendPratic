public class Main {
    public static void main(String[] args) {

        System.out.println(getFirstAndLastDigitSum(1234567));

        System.out.println("************************************************");

        System.out.println(hasSameLastDigit(12, 23, 35, 16, 17));
        System.out.println(hasSameLastDigit(12, 23, 35, 13, 16, 17));

        System.out.println("************************************************");

        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(45)); // 5

        System.out.println("************************************************");
        BankAccount account = new BankAccount(123456789, 1000000, "Semih AVCI", "semavci@example.com", "password123");

        System.out.println("Banka Hesap Bilgileri:");
        System.out.println("Hesap Numarası: " + account.getAccountNumber());
        System.out.println("İsim:"+account.getCustomerName()) ;
        System.out.println("Bakiye:"+account.getAccountBalance());
        System.out.println("email:"+account.getEmail());
        System.out.println("password"+account.getPassword());
    }

    public static int getFirstAndLastDigitSum(int number) {

        number = Math.abs(number);

        int lastDigit = number % 10;

        int firstDigit = 0;
        while (number >= 10) {
            firstDigit = number / 10;
            number /= 10;
        }

        return firstDigit + lastDigit;
    }

    public static boolean hasSameLastDigit(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] % 10 == numbers[j] % 10) {
                    return true;
                }
            }

        }
        return false;
    }

    public static int getLargestPrime(int numb) {
        if (numb <= 1) {
            return -1;
        }

        int largestPrime = -1;
        for (int i = 2; i <= numb; i++) {
            while (numb % i == 0) {
                largestPrime = i;
                numb /= i;
            }
        }

        return largestPrime;
    }
}