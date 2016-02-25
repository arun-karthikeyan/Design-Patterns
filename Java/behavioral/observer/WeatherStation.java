package behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;

public class WeatherStation implements WeatherSubject {

    HashSet<WeatherObserver> observers;
    int currentTemperature;

    public WeatherStation(int currentTemperature) {
        // TODO Auto-generated constructor stub
        this.currentTemperature = currentTemperature;
        observers = new HashSet<WeatherObserver>();
    }

    @Override
    public boolean addObserver(WeatherObserver observer) {
        // TODO Auto-generated method stub
        return this.observers.add(observer);

    }

    @Override
    public boolean removeObserver(WeatherObserver observer) {
        // TODO Auto-generated method stub
        return this.observers.remove(observer);
    }

    public void setTemperature(int newTemperature) {
        
        if (this.currentTemperature != newTemperature) {
            System.out.println("\nWeather Station setting temperature to "+newTemperature);
            this.currentTemperature = newTemperature;
            if(this.observers.size()>0)
            {
                doNotify();
            }else{
                System.out.println("No Observers to Notify");
            }
        }
    }

    @Override
    public void doNotify() {
        // TODO Auto-generated method stub
        Iterator<WeatherObserver> observerList = this.observers.iterator();
        while (observerList.hasNext()) {
            observerList.next().doUpdate(currentTemperature);
        }

    }
}
