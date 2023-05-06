package vandy.kitchen;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vegPizzaBean")
public class VegPizza implements  Pizza{
    @Override
    public String preparePizza() {
        return "onion pizza ready !";
    }
}
