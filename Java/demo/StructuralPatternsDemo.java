package demo;

import structural.adapter.TemperatureReporter_C;
import structural.adapter.TemperatureReporter_O;
import structural.bridge.BigBus;
import structural.bridge.BigEngine;
import structural.bridge.SmallCar;
import structural.bridge.SmallEngine;
import structural.bridge.SuperFastEngine;
import structural.bridge.Vehicle;
import structural.composite.Composite;
import structural.composite.Leaf;
import structural.decorator.Animal;
import structural.decorator.GrowlDecorator;
import structural.decorator.LegDecorator;
import structural.decorator.LivingAnimal;
import structural.decorator.WingsDecorator;
import structural.facade.Facade;
import structural.flyweight.Flyweight;
import structural.flyweight.FlyweightFactory;
import structural.proxy.FastThing;
import structural.proxy.Proxy;

public class StructuralPatternsDemo {
    public static void adapterPattern() {
        // Here all the methods of the parent class "CelciusReporter" are also
        // accessible
        TemperatureReporter_C tempReport = new TemperatureReporter_C();
        tempReport.setTemperatureInC(0);
        System.out.println("Temperature in Celcius : "
                + tempReport.getTemperatureInC());
        System.out.println("Temperature in Fahrenheit : "
                + tempReport.getTemperatureInF());

        // Here the methods of the class "CelciusReporter" are not accessible,
        // since the class "TemperatureReporter_O" doesn't inherit the class
        // "CelciusReporter" but merely uses its method by composition
        TemperatureReporter_O tempReport2 = new TemperatureReporter_O();
        tempReport2.setTemperatureInF(85);
        System.out.println("Temperature in Celcius : "
                + tempReport2.getTemperatureInC());
        System.out.println("Temperature in Fahrenheit : "
                + tempReport2.getTemperatureInF());
    }

    public static void compositePattern() {
        Leaf leaf1 = new Leaf("Arun");
        Leaf leaf2 = new Leaf("Aarthy");
        Composite composite1 = new Composite();
        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);

        Leaf leaf3 = new Leaf("Selvi");
        Leaf leaf4 = new Leaf("Karthikeyan");
        Composite composite2 = new Composite();
        composite2.addComponent(leaf3);
        composite2.addComponent(leaf4);

        Composite composite3 = new Composite();
        composite3.addComponent(composite1);
        composite3.addComponent(composite2);

        leaf1.sayHello();
        leaf2.sayHello();
        System.out.println();
        composite2.sayHello();
        System.out.println();
        composite3.sayGoodBye();
    }

    public static void proxyPattern() {
        FastThing fastThing = new FastThing();
        fastThing.sayHello();
        Proxy proxy = new Proxy();
        proxy.sayHello();
    }

    public static void flyweightPattern() {
        FlyweightFactory flyFac = FlyweightFactory.getInstance();
        for (int i = 1; i < 5; ++i) {
            Flyweight flyAdd = flyFac.getObject("add");
            flyAdd.doMath(i, i);
            Flyweight flyMul = flyFac.getObject("mul");
            flyMul.doMath(i, i);
        }
    }

    public static void facadePattern() {
        Facade facade = new Facade();
        int x = 10;
        System.out.println("Cube of " + x + " is " + facade.getCube(x));
        System.out.println("Twice the Cube of " + x + " is "
                + facade.getTwiceCube(x));
        System.out.println("Twice the Sixth Power of " + x + " is "
                + facade.getTwiceSixthPower(x));
    }

    public static void decoratorPattern() {
        Animal livingAnimal = new LivingAnimal();
        livingAnimal.describe();
        livingAnimal = new LegDecorator(livingAnimal);
        livingAnimal.describe();
        livingAnimal = new WingsDecorator(livingAnimal);
        livingAnimal.describe();
        livingAnimal = new GrowlDecorator(livingAnimal);
        livingAnimal = new GrowlDecorator(livingAnimal);
        livingAnimal.describe();

    }

    public static void bridgePattern() {
        Vehicle bigBus = new BigBus(new SmallEngine());
        bigBus.drive();
        bigBus.setEngine(new BigEngine());
        bigBus.drive();
        bigBus.setEngine(new SuperFastEngine());
        bigBus.drive();

        Vehicle smallCar = new SmallCar(new SmallEngine());
        smallCar.drive();
        smallCar.setEngine(new BigEngine());
        smallCar.drive();
    }

    public static void main(String[] args) {
        // adapterPattern();
        // compositePattern();
        // proxyPattern();
        // flyweightPattern();
        // facadePattern();
        // bridgePattern();
        // decoratorPattern();
    }
}
