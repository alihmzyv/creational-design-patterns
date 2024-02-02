package org.alihmzyv.factorymethod.pizzafactory;

import org.alihmzyv.factorymethod.constant.PizzaType;
import org.alihmzyv.factorymethod.model.pizza.NYStyleCheesePizza;
import org.alihmzyv.factorymethod.model.pizza.NYStylePepperoniPizza;
import org.alihmzyv.factorymethod.model.pizza.Pizza;

import java.util.Optional;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Optional<Pizza> createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE -> {
                return Optional.of(new NYStyleCheesePizza());
            }
            case PEPPERONI -> {
                return Optional.of(new NYStylePepperoniPizza());
            }
            default -> {
                return Optional.empty();
            }
        }
    }
}
