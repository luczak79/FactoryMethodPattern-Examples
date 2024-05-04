package Example2;

public class FourCheesesFactory extends PizzaFactory {
    @Override
    protected Pizza createPizza() {
        return new FourCheeses();
    }
}
