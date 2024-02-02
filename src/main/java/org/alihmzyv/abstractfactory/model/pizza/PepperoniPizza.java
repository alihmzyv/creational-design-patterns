package org.alihmzyv.abstractfactory.model.pizza;

import org.alihmzyv.abstractfactory.ingredientfactory.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza {
    private final PizzaIngredientsFactory pizzaIngredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    public void prepare() {
        this.name = "Pepperoni Pizza";
        this.dough = pizzaIngredientsFactory.createDough();
        this.sauce = pizzaIngredientsFactory.createSauce();
    }
}
