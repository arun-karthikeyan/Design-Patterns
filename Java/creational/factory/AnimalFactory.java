package creational.factory;

public class AnimalFactory {
    public Animal getInstance(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
