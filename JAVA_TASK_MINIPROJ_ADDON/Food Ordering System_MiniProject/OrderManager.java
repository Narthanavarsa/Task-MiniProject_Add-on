import java.util.ArrayList;
import java.util.Iterator;

public class OrderManager {
    // Dynamic storage for cart items
    private ArrayList<FoodItem> cart = new ArrayList<>();
    private double discountAmount = 0;

    // Adds a new FoodItem object to the list
    public void addItem(FoodItem item) {
        cart.add(item);
    }

    // Removes an item by name using an Iterator
    public boolean removeItem(String name) {
        Iterator<FoodItem> it = cart.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Business logic for coupon application
    public boolean applyCoupon(String code) {
        if (code.equalsIgnoreCase("SAVE10")) {
            this.discountAmount = calculateSubtotal() * 0.10;
            return true;
        }
        return false;
    }

    public double calculateSubtotal() {
        double total = 0;
        for (FoodItem item : cart) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getFinalTotal() {
        return calculateSubtotal() - discountAmount;
    }

    public double getDiscount() { return discountAmount; }
    public ArrayList<FoodItem> getCart() { return cart; }
}