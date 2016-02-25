package structural.adapter;

public class TemperatureReporter_O implements TemperatureInfo {
CelciusReporter celcius;
public TemperatureReporter_O() {
 celcius = new TemperatureReporter_C();
}
@Override
public double getTemperatureInF() {
    // TODO Auto-generated method stub
    return celciusToFahrenheit(celcius.getTemperature());
    
}
private double celciusToFahrenheit(double temperatureInC) {
    double temperatureInF = (temperatureInC * 9 / 5d) + 32;
    return temperatureInF;
}

private double fahrenheitToCelcius(double temperatureInF) {
    double temperatureInC = (temperatureInF - 32) * (5d / 9);
    return temperatureInC;
}
@Override
public void setTemperatureInF(double temperatureInF) {
    // TODO Auto-generated method stub
    celcius.setTemperature(fahrenheitToCelcius(temperatureInF));
    
}

@Override
public double getTemperatureInC() {
    // TODO Auto-generated method stub
    return celcius.getTemperature();
}

@Override
public void setTemperatureInC(double temperatureInC) {
    // TODO Auto-generated method stub
    celcius.setTemperature(temperatureInC);
    
}
}
