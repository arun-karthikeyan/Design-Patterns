package structural.decorator;

public class LegDecorator extends AnimalDecorator{

    public LegDecorator(Animal animal) {
        super(animal);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void describe() {
        // TODO Auto-generated method stub
        animal.describe();
        System.out.println("I have legs");
        dance();
        
    }
    public void dance(){
        System.out.println("I can dance");
    }

}
