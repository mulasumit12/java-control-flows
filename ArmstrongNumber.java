import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number, sum = 0, digits = 0, temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        System.out.println("Is the number " + number + " an Armstrong number? " + (sum == original));
    }
}
