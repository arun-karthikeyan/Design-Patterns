package demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import behavioral.chainofresponsibility.EarthHandler;
import behavioral.chainofresponsibility.MercuryHandler;
import behavioral.chainofresponsibility.PlanetEnum;
import behavioral.chainofresponsibility.PlanetHandler;
import behavioral.chainofresponsibility.VenusHandler;
import behavioral.command.Breakfast;
import behavioral.command.BreakfastCommand;
import behavioral.command.Command;
import behavioral.command.Dinner;
import behavioral.command.DinnerCommand;
import behavioral.command.Lunch;
import behavioral.command.LunchCommand;
import behavioral.command.MealInvoker;
import behavioral.iterator.Item;
import behavioral.iterator.Menu;
import behavioral.mediator.AmericanSeller;
import behavioral.mediator.Buyer;
import behavioral.mediator.DollarConverter;
import behavioral.mediator.FrenchBuyer;
import behavioral.mediator.Mediator;
import behavioral.mediator.Seller;
import behavioral.mediator.SwedishBuyer;
import behavioral.mememto.DietInfo;
import behavioral.mememto.DietInfoCareTaker;
import behavioral.observer.WeatherObserver;
import behavioral.observer.WeatherObserver1;
import behavioral.observer.WeatherObserver2;
import behavioral.observer.WeatherStation;
import behavioral.state.EmotionalState;
import behavioral.state.HappyState;
import behavioral.state.Person;
import behavioral.state.SadState;
import behavioral.strategy.Context;
import behavioral.strategy.HikeStrategy;
import behavioral.strategy.SkiStrategy;
import behavioral.strategy.SleepStrategy;
import behavioral.strategy.Strategy;
import behavioral.templatemethod.DosaMeal;
import behavioral.templatemethod.HamburgerMeal;
import behavioral.templatemethod.Meal;
import behavioral.visitor.NumberElement;
import behavioral.visitor.NumberVisitor;
import behavioral.visitor.SumVisitor;
import behavioral.visitor.ThreeElement;
import behavioral.visitor.TotalSumVisitor;
import behavioral.visitor.TwoElement;

@SuppressWarnings("unused")
public class BehavioralPatternsDemo {
    public static void templateMethodPattern() {
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();
        Meal meal2 = new DosaMeal();
        meal2.doMeal();
    }

    public static void mediatorPattern() {
        Mediator mediator = new Mediator();
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        Buyer swedishBuyer = new SwedishBuyer(mediator);

        double sellingPriceInDollars = 10.0;
        Seller americanSeller = new AmericanSeller(mediator,
                sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        System.out.println();
        double frenchBidInEuros = 5.0d;
        while (!frenchBuyer.attemptPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1.5d;
        }
        System.out.println();
        double swedishBidInKronor = 55.0d;
        while (!swedishBuyer.attemptPurchase(swedishBidInKronor)) {
            swedishBidInKronor += 15.0d;
        }
    }

    public static void chainOfResponsibilityPattern() {
        PlanetHandler planetHandler = new MercuryHandler();
        // Setting up successors | Mercury --> Venus --> Earth
        {
            PlanetHandler venusHandler = new VenusHandler();
            PlanetHandler earthHandler = new EarthHandler();
            PlanetHandler mercuryHandler = new MercuryHandler();
            mercuryHandler.setSuccessor(venusHandler);
            venusHandler.setSuccessor(earthHandler);
            planetHandler = mercuryHandler;
        }

        planetHandler.handleRequest(PlanetEnum.MERCURY);
        System.out.println();
        planetHandler.handleRequest(PlanetEnum.EARTH);
        System.out.println();
        planetHandler.handleRequest(PlanetEnum.JUPITER);
        System.out.println();
        planetHandler.handleRequest(PlanetEnum.VENUS);
    }

    public static void observerPattern() {
        int initTemperature = 10;
        WeatherStation weatherSubject = new WeatherStation(initTemperature);
        WeatherObserver arun = new WeatherObserver1("Arun");
        WeatherObserver aarthy = new WeatherObserver1("Aarthy");
        WeatherObserver selvi = new WeatherObserver2("Selvi");
        WeatherObserver karthikeyan = new WeatherObserver2("Karthikeyan");

        weatherSubject.addObserver(arun);
        weatherSubject.addObserver(aarthy);
        weatherSubject.addObserver(selvi);
        weatherSubject.addObserver(karthikeyan);
        weatherSubject.setTemperature(20);
        weatherSubject.removeObserver(karthikeyan);
        weatherSubject.setTemperature(25);
        weatherSubject.removeObserver(selvi);
        weatherSubject.setTemperature(-11);
        weatherSubject.addObserver(karthikeyan);
        weatherSubject.removeObserver(arun);
        weatherSubject.setTemperature(2);
        weatherSubject.addObserver(arun);
        weatherSubject.addObserver(selvi);
        weatherSubject.setTemperature(13);
        weatherSubject.removeObserver(arun);
        weatherSubject.removeObserver(aarthy);
        weatherSubject.removeObserver(selvi);
        weatherSubject.removeObserver(karthikeyan);
        weatherSubject.setTemperature(24);
    }

    public static void strategyPattern() {
        Strategy hikeStrategy = new HikeStrategy();
        Strategy sleepStrategy = new SleepStrategy();
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(sleepStrategy, 20);
        System.out.println("Is " + context.getTemperature()
                + "'C good for sleeping ? " + context.getResult());
        context.setStrategy(skiStrategy);
        context.setTemperature(2);
        System.out.println("Is " + context.getTemperature()
                + "'C good for skiing ? " + context.getResult());
        context.setStrategy(sleepStrategy);
        System.out.println("Is " + context.getTemperature()
                + "'C good for sleeping ? " + context.getResult());
        context.setStrategy(hikeStrategy);
        context.setTemperature(25);
        System.out.println("Is " + context.getTemperature()
                + "'C good for hiking ? " + context.getResult());
    }

    public static void commandPattern() {
        // The receiver class
        Lunch lunch = new Lunch();
        Breakfast breakfast = new Breakfast();
        Dinner dinner = new Dinner();

        // The command interface and the concreate command class
        Command lunchCommand = new LunchCommand(lunch);
        Command breakfastCommand = new BreakfastCommand(breakfast);
        Command dinnerCommand = new DinnerCommand(dinner);

        // The invoker class; we can notice here that the invoker is decoupled
        // from the receiver
        MealInvoker mealInvoker = new MealInvoker(breakfastCommand);
        mealInvoker.invoke();
        mealInvoker.setCommand(lunchCommand);
        mealInvoker.invoke();
        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
    }

    public static void statePattern() {
        EmotionalState happyState = new HappyState();
        EmotionalState sadSate = new SadState();
        Person person = new Person(happyState);
        person.sayHi();
        person.sayBye();
        System.out.println();
        person.setState(sadSate);
        person.sayHi();
        person.sayBye();
    }

    public static void visitorPattern() {
        NumberElement twoElement = new TwoElement(5, 2);
        NumberElement threeElement = new ThreeElement(5, 2, 8);
        List<NumberElement> grouping = new LinkedList<NumberElement>();
        grouping.add(twoElement);
        grouping.add(threeElement);

        NumberVisitor sumVisitor = new SumVisitor();
        sumVisitor.visit(grouping);

        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        totalSumVisitor.visit(grouping);
        System.out.println("The total sum by the TotalSumVisitor is "
                + totalSumVisitor.getTotalSum());
    }

    public static void iteratorPattern() {
        Menu itemList = new Menu();
        Item item1 = new Item("gulabjamun", 100);
        Item item2 = new Item("Laddu", 90);
        Item item3 = new Item("Rasagulla", 110);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Iterator<Item> items = itemList.iterator();
        while (items.hasNext()) {
            System.out.println(items.next());

        }
        items.remove(); // removing the last item (rasagulla)
        System.out.println();
        items = itemList.iterator();
        while (items.hasNext()) {
            System.out.println(items.next());

        }
    }

    public static void mementoPattern() {
        DietInfo arun = new DietInfo("Arun", 1, 75);
        DietInfoCareTaker careTaker = new DietInfoCareTaker();
        System.out.println(arun);
        arun.setWeekandWeight(2, 74);
        System.out.println(arun);
        System.out.println("Saving current state...");
        careTaker.save(arun);
        arun.setWeekandWeight(3, 73);
        System.out.println(arun);
        arun.setWeekandWeight(4, 73);
        System.out.println(arun);
        System.out.println("Restoring old state...");
        careTaker.restore(arun);
        System.out.println(arun);

    }

    public static void main(String[] args) {
        // templateMethodPattern();
        // mediatorPattern();
        // chainOfResponsibilityPattern();
        // observerPattern();
        // strategyPattern();
        // commandPattern();
        // statePattern();
        // visitorPattern();
        // iteratorPattern();
        // mementoPattern();
    }
}
