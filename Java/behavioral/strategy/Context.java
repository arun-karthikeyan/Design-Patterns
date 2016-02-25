package behavioral.strategy;

public class Context {
Strategy strategy;
int temperatureInC;
public Context(Strategy strategy, int temperatureInC) {
    // TODO Auto-generated constructor stub
    this.strategy = strategy;
    this.temperatureInC = temperatureInC;
}

public void setTemperature(int temperatureInC){
    this.temperatureInC = temperatureInC;
}
public void setStrategy(Strategy strategy){
    this.strategy = strategy;
}
public boolean getResult(){
    return strategy.checkTemperature(temperatureInC);
}
public int getTemperature(){
    return this.temperatureInC;
}
}
