package org.alihmzyv.abstractfactory.ingredientfactory.impl;

import org.alihmzyv.abstractfactory.ingredientfactory.PizzaIngredientsFactory;
import org.alihmzyv.abstractfactory.model.ingredient.dough.Dough;
import org.alihmzyv.abstractfactory.model.ingredient.dough.VeryThinCrustDough;
import org.alihmzyv.abstractfactory.model.ingredient.sauce.PlumTomatoSauce;
import org.alihmzyv.abstractfactory.model.ingredient.sauce.Sauce;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
