package org.alihmzyv.factorymethod.model.pizza;

public class NYStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "NY Style Pepperoni Pizza";
        this.dough = "Very Thin Crust";
        this.sauce = "Marinara Sauce";
    }
}
