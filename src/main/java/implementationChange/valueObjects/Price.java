package implementationChange.valueObjects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return value == price.value;
    }
}
