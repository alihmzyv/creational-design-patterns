package org.alihmzyv.abstractfactory.ingredientfactory.impl;

import org.alihmzyv.abstractfactory.ingredientfactory.PizzaIngredientsFactory;
import org.alihmzyv.abstractfactory.model.ingredient.dough.Dough;
import org.alihmzyv.abstractfactory.model.ingredient.dough.ThinCrustDough;
import org.alihmzyv.abstractfactory.model.ingredient.sauce.MarinaraSauce;
import org.alihmzyv.abstractfactory.model.ingredient.sauce.Sauce;

public class ChicagoIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
