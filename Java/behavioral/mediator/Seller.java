package behavioral.mediator;

public abstract class Seller {
    Mediator mediator;
    String sellerNationality;
    String currency;
    double itemPricInSellerCurrency;

    public Seller(Mediator mediator, String sellerNationality, String currency, double itemPricInSellerCurrency) {
        this.mediator = mediator;
        this.currency = currency;
        this.sellerNationality = sellerNationality;
        this.itemPricInSellerCurrency = itemPricInSellerCurrency; 
    }

    public boolean isBidAccepted(double amount) {
        if (amount > itemPricInSellerCurrency) {
            System.out.println(sellerNationality+" Seller accepts bid of " + amount
                    + " " + this.currency);
            return true;
        } else {
            System.out.println(sellerNationality+" Seller rejects bid of " + amount
                    + this.currency);
            return false;
        }
    }
}
