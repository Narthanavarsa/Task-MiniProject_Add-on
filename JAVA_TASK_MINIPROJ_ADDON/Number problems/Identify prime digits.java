import java.util.*;
class PrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean found = false;

        for (char c : n.toCharArray()) {
            int d = c - '0';
            if (d == 2 || d == 3 || d == 5 || d == 7) {
                System.out.print(d + " ");
                found = true;
            }
        }
        if (!found) System.out.print("None");
    }
}
