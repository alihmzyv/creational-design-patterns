package org.alihmzyv.factorymethod.pizzafactory;

import org.alihmzyv.factorymethod.constant.PizzaType;
import org.alihmzyv.factorymethod.model.pizza.ChicagoStyleCheesePizza;
import org.alihmzyv.factorymethod.model.pizza.ChicagoStylePepperoniPizza;
import org.alihmzyv.factorymethod.model.pizza.Pizza;

import java.util.Optional;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Optional<Pizza> createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE -> {
                return Optional.of(new ChicagoStyleCheesePizza());
            }
            case PEPPERONI -> {
                return Optional.of(new ChicagoStylePepperoniPizza());
            }
            default -> {
                return Optional.empty();
            }
        }
    }
}
