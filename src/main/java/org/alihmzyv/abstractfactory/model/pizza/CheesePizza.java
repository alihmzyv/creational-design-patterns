package org.alihmzyv.abstractfactory.model.pizza;

import org.alihmzyv.abstractfactory.ingredientfactory.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {
    private final PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    public void prepare() {
        this.name = "Cheese Pizza";
        this.dough = pizzaIngredientsFactory.createDough();
        this.sauce = pizzaIngredientsFactory.createSauce();
    }
}
