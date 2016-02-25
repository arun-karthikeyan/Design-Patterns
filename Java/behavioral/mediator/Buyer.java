package behavioral.mediator;

public abstract class Buyer {
    Mediator mediator;
    String currency;
    public Buyer(Mediator mediator, String currency){
        this.mediator = mediator;
        this.currency = currency;
    }
    public boolean attemptPurchase(double amount){
        return mediator.placeBid(amount, currency);
    }
}
