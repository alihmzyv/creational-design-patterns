package org.alihmzyv.abstractfactory.model.pizza;

import org.alihmzyv.abstractfactory.model.ingredient.dough.Dough;
import org.alihmzyv.abstractfactory.model.ingredient.sauce.Sauce;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
