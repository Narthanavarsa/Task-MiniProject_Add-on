import java.util.*;
class AdamNumber {
    static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n * n == reverse(reverse(n) * reverse(n)))
            System.out.println("Adam Number");
        else
            System.out.println("Not Adam Number");
    }
}
