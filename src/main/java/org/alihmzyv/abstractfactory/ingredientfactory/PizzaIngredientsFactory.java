package org.alihmzyv.abstractfactory.ingredientfactory;

import org.alihmzyv.abstractfactory.model.ingredient.dough.Dough;
import org.alihmzyv.abstractfactory.model.ingredient.sauce.Sauce;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
}
