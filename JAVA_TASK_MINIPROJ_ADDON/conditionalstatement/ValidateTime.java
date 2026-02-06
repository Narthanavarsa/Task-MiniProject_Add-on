import java.util.Scanner;

public class ValidateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
            System.out.println("Valid Time");
        } else {
            System.out.println("Invalid Time");
        }
    }
}
