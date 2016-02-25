package creational.builder;

public class MealDirector {
MealBuilder mealBuilder;
public MealDirector(MealBuilder mealBuilder) {
    // TODO Auto-generated constructor stub
    this.mealBuilder = mealBuilder;
}
public void constructMeal(){
    mealBuilder.buildDrink();
    mealBuilder.buildMainCourse();
    mealBuilder.buildSide();
}
public Meal getMeal(){
    return mealBuilder.getMeal();
}
}
