package structural.bridge;

public class SmallEngine implements Engine {

    int horsePower;
    public SmallEngine() {
        // TODO Auto-generated constructor stub
        horsePower = 100;
    }
    @Override
    public int go() {
        // TODO Auto-generated method stub
        System.out.println("Small engine is running...");
        return horsePower;
    }

}
