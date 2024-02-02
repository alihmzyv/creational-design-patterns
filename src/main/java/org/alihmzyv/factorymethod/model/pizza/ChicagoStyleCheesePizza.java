package org.alihmzyv.factorymethod.model.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "Chicago Style Cheese Pizza";
        this.dough = "Thin Crust";
        this.sauce = "Plum Tomato";
    }
}
