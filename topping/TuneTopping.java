package topping;

import pizza.BasePizza;

public class TuneTopping extends ToppingDecorator{

    public TuneTopping(BasePizza pizzaBase){
	super(pizzaBase);
	this.price = 1.0;
    }
}
