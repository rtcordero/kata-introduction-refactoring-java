package implementationChange;

import java.util.List;

public class Price {
    private final int value;


    public Price(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public boolean isMoreThan(Price price) {
        return this.value >= price.getValue();
    }

    static Price calculateTotalPrices(List<Price> prices) {
        int totalPriceValue = prices.stream()
                .mapToInt(Price::getValue)
                .sum();
        return new Price(totalPriceValue);
    }
}
