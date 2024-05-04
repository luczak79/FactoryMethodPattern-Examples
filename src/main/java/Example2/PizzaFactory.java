package Example2;

public abstract class PizzaFactory {
    public Pizza create() {
        return createPizza();
    }

    protected abstract Pizza createPizza();
}
