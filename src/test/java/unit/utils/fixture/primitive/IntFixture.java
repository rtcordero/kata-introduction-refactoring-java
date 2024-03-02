package unit.utils.fixture.primitive;

import java.util.concurrent.ThreadLocalRandom;

public class IntFixture {
    public static int randomMoreThan0() {
        var minValue = 1;
        var upperValue = (int) (Math.random() + minValue + 1);
        return ThreadLocalRandom.current().nextInt(minValue, upperValue);
    }

    public static int randomEqualOrMoreThan(int minValue) {
        var upperValue = (int) (Math.random() + minValue + 1);
        return ThreadLocalRandom.current().nextInt(minValue, upperValue);
    }


    public static int randomLessThan(int value) {
        return ThreadLocalRandom.current().nextInt(0, value);
    }
}


