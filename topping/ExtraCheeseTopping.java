package topping;

import pizza.BasePizza;

public class ExtraCheeseTopping extends ToppingDecorator{

    public ExtraCheeseTopping(BasePizza pizzaToDecorate) {
	super(pizzaToDecorate);
	this.price = 0.95;
    }

}
