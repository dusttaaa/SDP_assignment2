public class Main {
    public static void main(String[] args) {
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();

        System.out.println("Factory Method");
        System.out.println(espresso.getName());
        System.out.println(latte.getName());



        MenuFactory italianFactory = new ItalianMenuFactory();
        Coffee italianCoffee = italianFactory.createCoffee();
        Dessert italianDessert = italianFactory.createDessert();
        System.out.println("Italian menu: ");
        System.out.println(italianCoffee.getName());
        System.out.println(italianDessert.getName());

        MenuFactory americanFactory = new AmericanMenuFactory();
        Coffee americanCoffee = americanFactory.createCoffee();
        Dessert americanDessert = americanFactory.createDessert();
        System.out.println("American menu: ");
        System.out.println(americanCoffee.getName());
        System.out.println(americanDessert.getName());
    }
}