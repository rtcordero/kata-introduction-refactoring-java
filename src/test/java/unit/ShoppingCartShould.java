package unit;

import implementationChange.valueObjects.Quantity;
import implementationChange.valueObjects.ShoppingCart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unit.utils.fixture.valueObjects.PriceFixture;

public class ShoppingCartShould {
    ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void count_number_of_products() {
        shoppingCart.add(PriceFixture.randomValueMoreThan0());

        var result = shoppingCart.getQuantity();

        Assert.assertEquals(new Quantity(1), result);
    }

    @Test
    public void calculate_total_price() {
        var price = PriceFixture.randomValueMoreThan0();
        shoppingCart.add(price);

        var result = shoppingCart.getTotalPrice();

        Assert.assertEquals(price, result);
    }

    @Test
    public void know_when_is_discount_applicable() {
        shoppingCart.add(PriceFixture.randomValueEqualOrMoreThan(100));

        var result = shoppingCart.hasDiscount();

        Assert.assertTrue(result);
    }

    @Test
    public void know_when_is_not_possible_to_apply_discount() {
        shoppingCart.add(PriceFixture.randomValueLessThan(100));

        var result = shoppingCart.hasDiscount();

        Assert.assertFalse(result);
    }

}
