package structural.bridge;

public class BigBus extends Vehicle {

    public BigBus(Engine engine) {
        this.engine = engine;
        this.weightInKilos = 3000;
    }
    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("The big bus is driving...");
        reportOnSpeed(engine.go());
        
    }

}
