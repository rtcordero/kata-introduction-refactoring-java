package implementationChange.valueObjects;

import java.util.ArrayList;
import java.util.List;

public class Prices {
    private final List<Price> prices;

    public Prices() {
        this.prices = new ArrayList<>();
    }

    public void addPrice(Price price) {
        this.prices.add(price);
    }

    public Price getTotalPrice() {
        int totalPriceValue = this.prices.stream()
                .mapToInt(Price::getValue)
                .sum();
        return new Price(totalPriceValue);
    }

    public Quantity getQuantity() {
        return new Quantity(this.prices.size());
    }
}
