package implementationChange.valueObjects;

import static implementationChange.valueObjects.Discount.moreThan100Discount;

public class ShoppingCart {
    private final Prices prices = new Prices();

    public void add(Price price) {
        this.prices.addPrice(price);
    }

    public Price getTotalPrice() {
        return prices.getTotalPrice();
    }

    public boolean hasDiscount() {
        return moreThan100Discount().isApplicable(getTotalPrice());
    }

    public Quantity getQuantity() {
        return prices.getQuantity();
    }
}
