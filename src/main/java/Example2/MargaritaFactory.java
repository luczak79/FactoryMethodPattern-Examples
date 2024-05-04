package Example2;

public class MargaritaFactory extends PizzaFactory {
    @Override
    protected Pizza createPizza() {
        return new Margarita();
    }
}
