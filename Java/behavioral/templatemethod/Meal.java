package behavioral.templatemethod;

public abstract class Meal {
    public abstract void prepareIngredients();
    public abstract void cook();
    public abstract void cleanUp();
    public void eat(){
        System.out.println("mmm, that was a good meal");
    }
    //template method
    public void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanUp();
        System.out.println();
    }
}
