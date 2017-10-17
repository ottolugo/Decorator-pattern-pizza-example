package topping;

import pizza.BasePizza;

public class ChickenTopping extends ToppingDecorator{

    public ChickenTopping(BasePizza pizzaToDecorate) {
	super(pizzaToDecorate);
	this.price = 1.20;
    }

}
