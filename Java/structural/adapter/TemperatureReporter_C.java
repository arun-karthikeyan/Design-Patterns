package structural.adapter;

//Adapter class
public class TemperatureReporter_C extends CelciusReporter implements
        TemperatureInfo {

    public TemperatureReporter_C() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public double getTemperatureInF() {
        // TODO Auto-generated method stub
        return celciusToFahrenheit(getTemperature());
    }

    @Override
    public double getTemperatureInC() {
        return getTemperature();
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        // TODO Auto-generated method stub
        setTemperature(fahrenheitToCelcius(temperatureInF));

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
    public void setTemperatureInC(double temperatureInC) {
        setTemperature(temperatureInC);
    }

}
