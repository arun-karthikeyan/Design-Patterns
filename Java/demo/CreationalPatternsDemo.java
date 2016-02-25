package demo;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.SpeciesFactory;
import creational.builder.EnglishMealBuilder;
import creational.builder.Meal;
import creational.builder.MealBuilder;
import creational.builder.MealDirector;
import creational.builder.TamilMealBuilder;
import creational.factory.Animal;
import creational.factory.AnimalFactory;
import creational.factory.SingletonAnimalFactory;
import creational.prototype.Dog;
import creational.prototype.Person;
import creational.singleton.Singleton;
@SuppressWarnings("unused")
public class CreationalPatternsDemo {
    private static void singletonExample() {
        Singleton singletonExample = Singleton.getInstance();
        singletonExample.printSomething();
    }

    private static void factoryExample() {
        AnimalFactory fac = new AnimalFactory();
        Animal dog = fac.getInstance("canine");
        Animal cat = fac.getInstance("feline");
        dog.makeSound();
        cat.makeSound();
    }

    private static void singletonFactoryExample() {
        SingletonAnimalFactory fac = SingletonAnimalFactory.getInstance();
        Animal dog = fac.getInstance("canine");
        Animal cat = fac.getInstance("feline");
        dog.makeSound();
        cat.makeSound();
    }

    private static void abstractFactoryExample() {
        SpeciesFactory fac1 = AbstractFactory.getSpeciesFactory("reptile");
        SpeciesFactory fac2 = AbstractFactory.getSpeciesFactory("mammal");

        creational.abstractFactory.Animal a1 = fac1.getAnimal("snake");
        creational.abstractFactory.Animal a2 = fac1.getAnimal("raptor");
        creational.abstractFactory.Animal a3 = fac2.getAnimal("canine");
        creational.abstractFactory.Animal a4 = fac2.getAnimal("feline");

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
        a4.makeSound();
    }

    private static void builderPattern() {
        // The director mealDirector, assembles the product Meal depending upon
        // the concrete MealBuilder used (TamilMealBuilder or
        // EnglishMealBuilder)
        MealBuilder mealBuilder = new TamilMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal tamilMeal = mealDirector.getMeal();

        mealBuilder = new EnglishMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal englishMeal = mealDirector.getMeal();

        System.out.println("Tamil Meal - " + tamilMeal);
        System.out.println("English Meal - " + englishMeal);
    }

    private static void prototypePattern() {
        Person p1 = new Person("Arun");
        Person p2 = (Person) p1.doClone();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println();
        p2.changeToNewName("Arun Karthikeyan");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println();
        Dog d1 = new Dog("Woof");
        Dog d2 = (Dog) d1.doClone();
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println();
        d2.setSound("wrrooff");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }

    public static void main(String[] args) {
        // singletonExample();
        // factoryExample();
        // singletonFactoryExample();
        // abstractFactoryExample();
        // builderPattern();
        // prototypePattern();
    }
}
