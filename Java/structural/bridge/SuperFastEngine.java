package structural.bridge;

public class SuperFastEngine implements Engine {

    int horsePower;
    public SuperFastEngine() {
        // TODO Auto-generated constructor stub
        horsePower = 1500;
    }
    
    @Override
    public int go() {

        System.out.println("The super fast engine is running...");
        return horsePower;
        
    }

}
