package topping;

import pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {

    protected BasePizza basePizza;
    
    public ToppingDecorator(BasePizza pizzaToDecorate)
    {
        this.basePizza = pizzaToDecorate;
    }

    @Override
    public double getPrice(){
        return (this.basePizza.getPrice() + this.price);
    }
}
