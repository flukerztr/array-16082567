/**
 * discount
 */
public class discount {

    
    // Static variables for discount rates
    private static final double SILVER_DISCOUNT = 0.02; // 2% for Silver
    private static final double GOLD_DISCOUNT = 0.03;   // 3% for Gold
    private static final double PLATINUM_DISCOUNT = 0.05;// 5% for Platinum

    // Static method to calculate discounted price based on membership level and product price
    public static double calculateDiscountedPrice(int price, String membershipLevel) {
        double discount = 0.0;

        // Determine discount based on membership level and price
        switch (membershipLevel.toLowerCase()) {
            case "silver":
                if (price >= 1000) {
                    discount = SILVER_DISCOUNT; // 2% discount for Silver
                }
                break;
            case "gold":
                if (price >= 1000) {
                    discount = GOLD_DISCOUNT; // 3% discount for Gold
                }
                break;
            case "platinum":
                if (price < 1000) {
                    discount = PLATINUM_DISCOUNT; // 5% discount for Platinum even if price < 1000
                } else {
                    discount = PLATINUM_DISCOUNT; // 5% discount for Platinum even if price >= 1000
                }
                break;
            default:
                // No discount for unknown membership levels
                break;
        }

        // Calculate the discounted price
        return price * (1 - discount);
    }

    public static void main(String[] args) {
        // Example usage
        int productPrice = 1000;

        System.out.println("Silver Member: $" + calculateDiscountedPrice(productPrice, "silver"));
        System.out.println("Gold Member: $" + calculateDiscountedPrice(productPrice, "gold"));
        System.out.println("Platinum Member: $" + calculateDiscountedPrice(productPrice, "platinum"));
        System.out.println("Non-Member: $" + calculateDiscountedPrice(productPrice, "none"));
    }
}