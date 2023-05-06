package vandy.kitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pizzaController")
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public  PizzaController(@Qualifier("vegPizzaBean") Pizza pizza){
        this.pizza = pizza;
    }

   /** comment above lines and uncomment below lines to make spring to handle the non veg pizza **/

//    @Autowired
//    public  PizzaController(@Qualifier("nonVegPizzaBean") Pizza pizza){
//       this.pizza = pizza;
//    }



    public String getMyPizza(){
        return pizza.preparePizza();
    }

}






