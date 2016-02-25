package creational.builder;
//Abstract builder class
public abstract class MealBuilder {
public abstract void buildDrink();
public abstract void buildSide();
public abstract void buildMainCourse();
public abstract Meal getMeal();
}
