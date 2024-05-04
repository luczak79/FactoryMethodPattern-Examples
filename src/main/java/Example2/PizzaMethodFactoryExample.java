package Example2;

public class PizzaMethodFactoryExample {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new MargaritaFactory();
        Pizza pizza = pizzaFactory.create();
        pizza.cook();

        PizzaFactory pizzaFactory2 = new FourCheesesFactory();
        Pizza pizza2 = pizzaFactory2.createPizza();
        pizza2.cook();
    }
}
