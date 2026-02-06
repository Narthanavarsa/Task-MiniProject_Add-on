import java.util.*;
class OddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), odd = 0, even = 0;

        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) even++;
            else odd++;
            n /= 10;
        }
        System.out.println("Odd = " + odd + ", Even = " + even);
    }
}
