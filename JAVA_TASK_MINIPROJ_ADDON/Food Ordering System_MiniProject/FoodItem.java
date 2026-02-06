public class FoodItem {
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize food item details
    public FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for accessing private data
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    
    // Logic to calculate total price for this specific item entry
    public double getTotalPrice() { return price * quantity; }
}