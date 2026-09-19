public class AmericanMenuFactory implements MenuFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
    @Override
    public Dessert createDessert() {
        return new Donut();
    }
}
