import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        boolean isValid = true;

        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            int maxDays = 31;

            if (month == 4 || month == 6 || month == 9 || month == 11)
                maxDays = 30;
            else if (month == 2) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    maxDays = 29;
                else
                    maxDays = 28;
            }

            if (day < 1 || day > maxDays)
                isValid = false;
        }

        if (isValid)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");
    }
}
