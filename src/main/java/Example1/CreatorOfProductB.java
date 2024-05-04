package Example1;

public class CreatorOfProductB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}
