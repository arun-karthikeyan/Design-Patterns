package behavioral.mediator;

public class SwedishBuyer extends Buyer {
private static String currency = "kronor";
    public SwedishBuyer(Mediator mediator) {
        super(mediator, currency);
        mediator.registerSwedishBuyer(this);
    }

}
