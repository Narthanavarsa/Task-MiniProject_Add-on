import java.util.Scanner;

public class MaxUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = (a > b ? a : b);
        max = (max > c ? max : c);
        max = (max > d ? max : d);

        System.out.println("Maximum: " + max);
    }
}
