package org.alihmzyv.factorymethod.pizzafactory;

import org.alihmzyv.factorymethod.constant.PizzaType;
import org.alihmzyv.factorymethod.model.pizza.Pizza;

import java.util.Optional;

public abstract class PizzaStore {
    public abstract Optional<Pizza> createPizza(PizzaType pizzaType);

    public Optional<Pizza> orderPizza(PizzaType pizzaType) {
        Optional<Pizza> pizza = createPizza(pizzaType);
        pizza.ifPresent(pizzaPresent -> {
            pizzaPresent.prepare();
            pizzaPresent.bake();
            pizzaPresent.cut();
            pizzaPresent.box();
        });
        return pizza;
    }
}
