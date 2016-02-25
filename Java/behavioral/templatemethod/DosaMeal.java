package behavioral.templatemethod;

public class DosaMeal extends Meal {

    @Override
    public void prepareIngredients() {
        // TODO Auto-generated method stub
        System.out.println("Getting the maavu");
    }

    @Override
    public void cook() {
        // TODO Auto-generated method stub
        System.out.println("carefully pouring the maavu on the dosa-kal into a perfect circle");
        
    }

    @Override
    public void cleanUp() {
        System.out.println("Washing the dosa-kal, plates, and keeping them in the cooking utensils storage once they dry");
        // TODO Auto-generated method stub
        
    }

}
