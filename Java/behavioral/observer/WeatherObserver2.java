package behavioral.observer;

public class WeatherObserver2 implements WeatherObserver {
    String name;
    public WeatherObserver2(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    @Override
    public void doUpdate(int temperature) {
        System.out.println(this.getClass().getSimpleName()+" Observer "+name+" found out updated temperature to be "+temperature);
        
    }
}
