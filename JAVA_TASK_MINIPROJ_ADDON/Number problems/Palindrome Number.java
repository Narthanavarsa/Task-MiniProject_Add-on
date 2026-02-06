import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (n.equals(new StringBuilder(n).reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
