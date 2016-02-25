package behavioral.mediator;

public class DollarConverter {
private static final double DOLLARUNIT = 1.0d;
private static final double EUROUNIT = 0.7d;
private static final double KRONAUNIT = 8.0d;

Mediator mediator;

public DollarConverter(Mediator mediator) {
    // TODO Auto-generated constructor stub
    this.mediator = mediator;
    mediator.registerDollarConverter(this);
}

public double convertEurosToDollars(double euros){
    double dollars = euros*(DOLLARUNIT/EUROUNIT);
    System.out.println("Converting "+euros+" euros to "+dollars+" dollars...");
    return dollars;
}
public double convertKronorToDollars(double kronor){
    double dollars = kronor*(DOLLARUNIT/KRONAUNIT);
    System.out.println("Converting "+kronor+" euros to "+dollars+" dollars...");
    return dollars;
}

}
