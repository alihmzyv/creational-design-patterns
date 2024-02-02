package org.alihmzyv.abstractfactory.pizzafactory;

import org.alihmzyv.abstractfactory.ingredientfactory.PizzaIngredientsFactory;
import org.alihmzyv.abstractfactory.ingredientfactory.impl.NYPizzaIngredientsFactory;
import org.alihmzyv.abstractfactory.model.pizza.CheesePizza;
import org.alihmzyv.abstractfactory.model.pizza.PepperoniPizza;
import org.alihmzyv.factorymethod.constant.PizzaType;
import org.alihmzyv.abstractfactory.model.pizza.Pizza;

import java.util.Optional;

public class NYPizzaStore extends PizzaStore {
    private final PizzaIngredientsFactory pizzaIngredientsFactory = new NYPizzaIngredientsFactory();

    @Override
    public Optional<Pizza> createPizza(PizzaType pizzaType) {
        switch (pizzaType) { //duplicate, but e.g., requirement can add something specific to ny pizza store, so kept it like that
            case CHEESE -> {
                return Optional.of(new CheesePizza(pizzaIngredientsFactory));
            }
            case PEPPERONI -> {
                return Optional.of(new PepperoniPizza(pizzaIngredientsFactory));
            }
            default -> {
                return Optional.empty();
            }
        }
    }
}
