package structural.adapter;
//Adaptee Class
public class CelciusReporter {
double temperatureInCelcius;
public double getTemperature(){
    return temperatureInCelcius;
}
public void setTemperature(double temperatureInC){
    temperatureInCelcius = temperatureInC;
}
}
