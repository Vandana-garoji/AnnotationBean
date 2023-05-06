package vandy.kitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

    /**  1. annotation based setter injection  **/


@Component("vegPizzaController")
public class VegPizzaController {
    private VegPizza vegPizza;


    @Autowired
    public VegPizzaController( VegPizza vegPizza){
        this.vegPizza = vegPizza;
    }

    public String getMyPizza(){
        return vegPizza.preparePizza();
    }
}


    /**  2. annotation based setter injection **/

//  @Component("vegPizzaController")
//  public class VegPizzaController {
//    private VegPizza vegPizza;
//
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }
//
//    public String getMyPizza(){
//        return vegPizza.preparePizza();
//    }
//  }



   /**  3. field level bean injection  **/

//  @Component("vegPizzaController")
//  public class VegPizzaController {
//
//    @Autowired
//    private VegPizza vegPizza;
//
//    public String getMyPizza(){
//        return vegPizza.preparePizza();
//    }
//  }

