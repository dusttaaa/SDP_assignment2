public class ItalianMenuFactory implements MenuFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
