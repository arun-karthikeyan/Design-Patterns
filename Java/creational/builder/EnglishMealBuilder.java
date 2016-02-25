package creational.builder;

public class EnglishMealBuilder extends MealBuilder {

    Meal meal;
    public EnglishMealBuilder() {
        // TODO Auto-generated constructor stub
        meal = new Meal();
    }
    @Override
    public void buildDrink() {
        // TODO Auto-generated method stub
        meal.setDrink("red wine");
        
    }

    @Override
    public void buildSide() {
        // TODO Auto-generated method stub
        meal.setSide("fries");
        
    }

    @Override
    public void buildMainCourse() {
        // TODO Auto-generated method stub
        meal.setMain("Salad");
        
    }

    @Override
    public Meal getMeal() {
        // TODO Auto-generated method stub
        return meal;
    }

}
