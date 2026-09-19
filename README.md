# SDP_assignment2

# Coffee Shop Factory

**Name:** Muratova Albina | SE-2511

### About the Project

In this project, I implemented two creational design patterns: Factory Method and Abstract Factory.
I chose a coffee shop as my example because it is easy to understand how different factories can create different types of coffee and complete menus.
The project is written in Java.

---

## 1. Factory Method

The Factory Method pattern is used to create individual coffee products.
Instead of creating every coffee object directly in the client, I use separate factories for each type of coffee.

### Main components

- **Product:** Coffee
- **Concrete Products:** Espresso and Latte
- **Creator:** CoffeeFactory
- **Concrete Creators:** EspressoFactory and LatteFactory

For example, `EspressoFactory` creates an Espresso object, while `LatteFactory` creates a Latte object.

### Example

```java
CoffeeFactory espressoFactory = new EspressoFactory();
Coffee espresso = espressoFactory.createCoffee();
```
The client uses the factory to create coffee without directly calling `new Espresso()`.

---

## 2. Abstract Factory

The Abstract Factory pattern extends the idea of the Factory Method.
In my project, a menu factory creates two related products: coffee and dessert.
I created two product families:

- Italian menu: Espresso and Tiramisu
- American menu: Latte and Donut

### Main components

- **Abstract Products:** Coffee and Dessert
- **Concrete Products:** Espresso, Latte, Tiramisu and Donut
- **Abstract Factory:** MenuFactory
- **Concrete Factories:** ItalianMenuFactory and AmericanMenuFactory

### Product families

| Factory | Coffee | Dessert |
|---|---|---|
| ItalianMenuFactory | Espresso | Tiramisu |
| AmericanMenuFactory | Latte | Donut |

Each concrete factory creates a matching coffee and dessert combination.

### Example

```java
MenuFactory italianFactory = new ItalianMenuFactory();

Coffee coffee = italianFactory.createCoffee();
Dessert dessert = italianFactory.createDessert();
```
The client works with the `MenuFactory`, `Coffee`, and `Dessert` interfaces.

---

## 3. Clean Code Principles

I tried to follow several Clean Code principles while developing this project.

### 1. Meaningful Names

I used names that explain what each class or method does.
For example:

```java
public class EspressoFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}
```

The names `EspressoFactory` and `createCoffee()` are easy to understand. We can see what the class creates and what the method does without reading the whole project.

---

### 2. Single Responsibility

Each class has one main responsibility.
For example:

```java
public class Tiramisu implements Dessert {

    @Override
    public String getName() {
        return "Tiramisu";
    }
}
```

The `Tiramisu` class represents one dessert. It does not create menus or manage other products.
This separation makes the code easier to change and maintain.

---

### 3. Small Methods

I kept the methods small and focused on one task.
For example:

```java
@Override
public Coffee createCoffee() {
    return new Espresso();
}
```

The `createCoffee()` method only creates and returns an Espresso object. It does not perform additional operations.

---

### 4. Consistent Formatting

I used the same formatting style throughout the project.
For example:

```java
public class LatteFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
```

The classes use consistent indentation, spacing, and curly braces. This makes the code easier to read.

---

### 5. Programming to Interfaces

I used interfaces so that the client does not need to depend on specific product implementations.
For example:

```java
MenuFactory italianFactory = new ItalianMenuFactory();

Coffee coffee = italianFactory.createCoffee();
Dessert dessert = italianFactory.createDessert();
```

The variables use the `MenuFactory`, `Coffee`, and `Dessert` interfaces.
This makes the code more flexible because the client can work with different factories through the same interfaces.

---

## 4. Testing

I tested the program in IntelliJ IDEA.
The program successfully created coffee and dessert products using both design patterns.
The output was:

```text
Factory Method:
Espresso
Latte
Italian menu:
Espresso
Tiramisu
American menu:
Latte
Donut
```

The program finished with exit code 0, which means that it ran without errors.

---

## 5. Project Structure

- `Coffee.java` — common interface for coffee products
- `Espresso.java` — Espresso product
- `Latte.java` — Latte product
- `CoffeeFactory.java` — Factory Method interface
- `EspressoFactory.java` — creates Espresso
- `LatteFactory.java` — creates Latte
- `Dessert.java` — common interface for desserts
- `Tiramisu.java` — Tiramisu product
- `Donut.java` — Donut product
- `MenuFactory.java` — Abstract Factory interface
- `ItalianMenuFactory.java` — creates the Italian menu family
- `AmericanMenuFactory.java` — creates the American menu family
- `Main.java` — tests the factories

---

## 6. Conclusion

This assignment helped me understand how Factory Method and Abstract Factory work.
The Factory Method creates individual products, while the Abstract Factory creates a family of related products.
I also learned how interfaces can make a project more organized and easier to extend.
