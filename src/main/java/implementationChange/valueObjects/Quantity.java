package implementationChange.valueObjects;

public class Quantity {

    private final int value;

    public Quantity(int quantity) {
        this.value = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return value == quantity.value;
    }
}
