import java.util.*;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) System.out.println(i);
            }
        }
    }
}
