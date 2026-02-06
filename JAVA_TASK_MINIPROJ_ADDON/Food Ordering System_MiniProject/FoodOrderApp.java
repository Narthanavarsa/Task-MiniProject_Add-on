import java.util.Scanner;

public class FoodOrderApp {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Scanner sc = new Scanner(System.in);
        
        // Predefined menu arrays
        String[] menu = {"Burger", "Pizza", "Fries", "Coke"};
        double[] prices = {150.0, 300.0, 80.0, 50.0};
        int choice;

        do {
            System.out.println("\n===== RESTAURANT MENU =====");
            for(int i=0; i<menu.length; i++) {
                System.out.println((i+1) + ". " + menu[i] + " - ₹" + prices[i]);
            }
            System.out.println("5. Remove Item\n6. Apply Coupon\n7. Generate Bill & Exit");
            System.out.print("Enter Choice (1-7): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: case 2: case 3: case 4:
                    System.out.print("Enter Quantity: ");
                    int q = sc.nextInt();
                    manager.addItem(new FoodItem(menu[choice-1], prices[choice-1], q));
                    System.out.println("Item added to cart.");
                    break;
                case 5:
                    System.out.print("Enter item name to remove: ");
                    if(manager.removeItem(sc.next())) System.out.println("Item removed.");
                    else System.out.println("Item not found in cart.");
                    break;
                case 6:
                    System.out.print("Enter Coupon Code: ");
                    if(manager.applyCoupon(sc.next())) System.out.println("10% Discount Applied!");
                    else System.out.println("Invalid Coupon.");
                    break;
                case 7:
                    printReceipt(manager);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        sc.close();
    }

    // Helper method to format the final output
    private static void printReceipt(OrderManager m) {
        System.out.println("\n********** FINAL RECEIPT **********");
        for (FoodItem i : m.getCart()) {
            System.out.printf("%-15s x%d  ₹%.2f\n", i.getName(), i.getQuantity(), i.getTotalPrice());
        }
        System.out.println("-----------------------------------");
        System.out.printf("Subtotal:       ₹%.2f\n", m.calculateSubtotal());
        System.out.printf("Discount:       ₹%.2f\n", m.getDiscount());
        System.out.printf("Payable Amount: ₹%.2f\n", m.getFinalTotal());
        System.out.println("***********************************");
        System.out.println("Thank you for your order!");
    }
}