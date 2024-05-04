package Example1;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new CreatorOfProductA();
        Creator creatorB = new CreatorOfProductB();

        Product productA = creatorA.factoryMethod();
        Product productB = creatorB.factoryMethod();

        productA.display();
        productB.display();
    }
}
