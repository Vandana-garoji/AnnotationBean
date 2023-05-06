package vandy.kitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("nonVegPizzaController")
public class NonVegPizzaController {
    private NonVegPizza nonVegPizza;


    @Autowired
    public NonVegPizzaController( NonVegPizza nonVegPizza){
        this.nonVegPizza = nonVegPizza;
    }

    public String getMyPizza(){
        return nonVegPizza.preparePizza();
    }
}
