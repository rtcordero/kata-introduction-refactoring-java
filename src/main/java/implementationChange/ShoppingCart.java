package implementationChange;

import java.util.ArrayList;
import java.util.List;

import static implementationChange.Discount.discountMoreThan100;
import static implementationChange.Price.calculateTotalPrices;

public class ShoppingCart {
    private final List<Price> prices = new ArrayList<>();

    public void add(Price price) {
        this.prices.add(price);
    }

    public Price getTotalPrice() {
        return calculateTotalPrices(prices);
    }

    public boolean hasDiscount() {
        return discountMoreThan100().isApplicable(getTotalPrice());
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
