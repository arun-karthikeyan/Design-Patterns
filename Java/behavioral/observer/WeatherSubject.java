package behavioral.observer;

public interface WeatherSubject {
public boolean addObserver(WeatherObserver observer);
public boolean removeObserver(WeatherObserver observer);
public void doNotify();
}
