package behavioral.strategy;

public class SleepStrategy implements Strategy {

    @Override
    public boolean checkTemperature(int temperature) {
        // TODO Auto-generated method stub
        return temperature>18 && temperature<=23;
    }

}
