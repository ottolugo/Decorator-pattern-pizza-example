package main;

import pizza.*;
import topping.*;

public class Example {

    public static void main(String[] args) {
    	
	//Let's start with a barbecue pizza
	BasePizza pizza = new Barbecue();
	System.out.println("Barbecue has price: " + pizza.getPrice());
		
	//Now we add some cheese
	ExtraCheeseTopping ext = new ExtraCheeseTopping(pizza);
	System.out.println("Barbecue with more cheese: " + ext.getPrice());
	
	//And now we want some tune
	TuneTopping tt = new TuneTopping(ext);
	System.out.println("Barbacue with more cheese and tune: " + tt.getPrice());
	
    }
}
