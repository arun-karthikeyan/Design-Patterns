package structural.bridge;

public abstract class Vehicle {
Engine engine;
int weightInKilos;

public abstract void drive();
public void setEngine(Engine newEngine){
    this.engine = newEngine;
}
public void reportOnSpeed(int horsePower){
    int ratio = weightInKilos/horsePower;
    if(ratio<3){
        System.out.println("The vehicle is going at fast speed");
    }else
        if((ratio>=3) && (ratio<8)){
            System.out.println("The vehicle is going at average speed");
        }else{
            System.out.println("The vehicle is going at slow speed");
        }
    System.out.println();
}
}
