package structural.decorator;

public class GrowlDecorator extends AnimalDecorator {

    public GrowlDecorator(Animal animal) {
        super(animal);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("groooooowwwllllll!!!!");
        
    }

}
