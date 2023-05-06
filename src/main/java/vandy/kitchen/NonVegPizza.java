package vandy.kitchen;

import org.springframework.stereotype.Component;

@Component("nonVegPizzaBean")
public class NonVegPizza implements  Pizza {
    @Override
    public String preparePizza() {
        return "chicken pizza ready !";
    }
}



/**  follow same approach as of in vegPizza controller for all kinds of injections to work on this class too **/