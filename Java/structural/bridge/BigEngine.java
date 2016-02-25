package structural.bridge;

public class BigEngine implements Engine {

    int horsePower;
    public BigEngine() {
        // TODO Auto-generated constructor stub
        horsePower = 350;
    }
    @Override
    public int go() {
        // TODO Auto-generated method stub
        System.out.println("Big engine is running...");
        return horsePower;
    }

}
