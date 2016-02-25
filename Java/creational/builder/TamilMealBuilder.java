package creational.builder;

public class TamilMealBuilder extends MealBuilder {

    Meal meal;
    public TamilMealBuilder() {
        // TODO Auto-generated constructor stub
        meal = new Meal();
    }
    @Override
    public void buildDrink() {
        meal.setDrink("Payasam");
        
    }

    @Override
    public void buildSide() {
        meal.setSide("Appalam");
        
    }

    @Override
    public void buildMainCourse() {
        meal.setMain("Sambar Sadham");
        
    }

    @Override
    public Meal getMeal() {
        // TODO Auto-generated method stub
        return meal;
    }


   
}
