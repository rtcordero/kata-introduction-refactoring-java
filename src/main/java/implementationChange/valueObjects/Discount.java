package implementationChange.valueObjects;

public class Discount {
    Price value;

    private Discount(Price price) {
        this.value = price;
    }

    public boolean isApplicable(Price price) {
        return price.isMoreThan(this.value);
    }

    public static Discount moreThan100Discount() {
        return new Discount(new Price(100));
    }

}
