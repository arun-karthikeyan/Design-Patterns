package behavioral.mediator;

public class FrenchBuyer extends Buyer {
private static String currency = "euros";
    public FrenchBuyer(Mediator mediator) {
        super(mediator, currency);
        mediator.registerFrenchBuyer(this);
    }

}
