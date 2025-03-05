package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeDecoratorTest {
    @Test
    public void testWrappedObject() {
        Espresso espresso = new Espresso();
        MilkCoffee milkCoffee = new MilkCoffee();

        CoffeeWithSugar espressoWithSugar = new CoffeeWithSugar(espresso);
        CoffeeWithSugar milkCoffeeWithSugar = new CoffeeWithSugar(milkCoffee);

        assertEquals("Espresso with sugar", espressoWithSugar.getDescription(), "Should return Espresso with sugar");
        assertEquals("Milk Coffee with sugar", milkCoffeeWithSugar.getDescription(), "Should return Milk Coffee with sugar");

        double expectedEspressoWithSugarPrice = CoffeeType.ESPRESSO.getPrice() + CoffeeWithSugar.additionalPrice;
        double expectedMilkCoffeeWithSugarPrice = CoffeeType.MILK_COFFEE.getPrice() + CoffeeWithSugar.additionalPrice;
        assertEquals(expectedEspressoWithSugarPrice, espressoWithSugar.getPrice(), 0.01, "Espresso with sugar price should be " + expectedEspressoWithSugarPrice);
        assertEquals(expectedMilkCoffeeWithSugarPrice, milkCoffeeWithSugar.getPrice(), 0.01, "Milk Coffee with sugar price should be " + expectedMilkCoffeeWithSugarPrice);
    }
}
