package unit.utils.fixture.valueObjects;

import implementationChange.valueObjects.Price;
import unit.utils.fixture.primitive.IntFixture;

public class PriceFixture {
    public static Price randomValueMoreThan0() {
        return new Price(IntFixture.randomMoreThan0());
    }

    public static Price randomValueEqualOrMoreThan(int minValue) {
        return new Price(IntFixture.randomEqualOrMoreThan(minValue));
    }


    public static Price randomValueLessThan(int value) {
        return new Price (IntFixture.randomLessThan(value));
    }
}
