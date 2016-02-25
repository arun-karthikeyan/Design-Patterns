package behavioral.mediator;

public class AmericanSeller extends Seller {
    private static String currency = "dollars";
    private static String nationality = "American";
    public AmericanSeller(Mediator mediator, double itemPriceInDollars) {
        super(mediator,nationality, currency, itemPriceInDollars);
        mediator.registerAmericanSeller(this);
        // TODO Auto-generated constructor stub
    }

}
