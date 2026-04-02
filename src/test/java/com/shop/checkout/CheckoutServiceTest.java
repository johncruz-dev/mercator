import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutServiceTest {

    private final CheckoutService checkout = new CheckoutService();

    @Test
    void emptyBasketCostsZero() {
        assertEquals(0, checkout.totalInPence(List.of()));
    }

    @Test
    void singleAppleCosts60p() {
        assertEquals(60, checkout.totalInPence(List.of("Apple")));
    }

    @Test
    void singleOrangeCosts25p() {
        assertEquals(25, checkout.totalInPence(List.of("Orange")));
    }

    @Test
    void exampleBasketCosts205p() {
        assertEquals(205, checkout.totalInPence(List.of("Apple", "Apple", "Orange", "Apple")));
    }
}