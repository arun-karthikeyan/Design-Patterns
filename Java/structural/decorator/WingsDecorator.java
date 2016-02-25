package structural.decorator;

public class WingsDecorator extends AnimalDecorator {

    public WingsDecorator(Animal animal) {
        super(animal);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have wings");
        fly();
        // TODO Auto-generated method stub
        
    }
    public void fly(){
        System.out.println("I can fly");
    }

}
