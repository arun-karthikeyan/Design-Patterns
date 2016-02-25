package structural.bridge;

public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        // TODO Auto-generated constructor stub
        this.engine = engine;
        this.weightInKilos = 600;
    }
    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("The small car is driving...");
        reportOnSpeed(engine.go());
        
    }

    
}
