package org.alihmzyv.factorymethod.model.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Thin Crust";
        this.sauce = "Plum Tomato Sauce";
    }
}
