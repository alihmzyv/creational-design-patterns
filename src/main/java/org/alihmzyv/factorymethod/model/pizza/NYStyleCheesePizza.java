package org.alihmzyv.factorymethod.model.pizza;

public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "NY Style Cheese Pizza";
        this.dough = "Thin Crust";
        this.sauce = "Marinara Sauce";
    }
}
