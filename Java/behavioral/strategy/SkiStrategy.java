package behavioral.strategy;

public class SkiStrategy implements Strategy{

    @Override
    public boolean checkTemperature(int temperature) {
        // TODO Auto-generated method stub
        return temperature<5;
    }

}
