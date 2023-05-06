package vandy.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import vandy.kitchen.NonVegPizzaController;
import vandy.kitchen.PizzaController;
import vandy.kitchen.VegPizzaController;

@ComponentScan(basePackages = "vandy")
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(MyApplication.class, args);


        NonVegPizzaController nonVegPizzaController = (NonVegPizzaController) context.getBean("nonVegPizzaController");
        System.out.println(nonVegPizzaController.getMyPizza());

        VegPizzaController vegPizzaController = (VegPizzaController) context.getBean("vegPizzaController");
        System.out.println(vegPizzaController.getMyPizza());


        /** whatever qualifier pizza controller have , we get that pizza **/

//        PizzaController PizzaController = (PizzaController) context.getBean("pizzaController");
//        System.out.println(pizzaController.getMyPizza());

    }
}
