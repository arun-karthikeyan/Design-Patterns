package behavioral.templatemethod;

public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredients() {
        // TODO Auto-generated method stub
        System.out.println("Getting burgers, buns, and french fries");
        
    }

    @Override
    public void cook() {
        // TODO Auto-generated method stub
        System.out.println("Cooking burgers on the grill and fries in oven");
        
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
        // TODO Auto-generated method stub
        
    }

}
