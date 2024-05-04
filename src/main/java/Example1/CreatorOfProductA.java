package Example1;

public class CreatorOfProductA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
