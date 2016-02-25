package behavioral.mediator;


public class Mediator {
Buyer frenchBuyer;
Seller americanSeller;
Buyer swedishBuyer;
DollarConverter dollarConverter;

public void registerDollarConverter(DollarConverter dollarConverter){
    this.dollarConverter = dollarConverter;
    System.out.println("Registering Dollar Converter with Mediator...");
}
public void registerFrenchBuyer(Buyer frenchBuyer){
    this.frenchBuyer = frenchBuyer;
    System.out.println("Registering French Buyer with Mediator...");
}
public void registerSwedishBuyer(Buyer swedishBuyer){
    this.swedishBuyer = swedishBuyer;
    System.out.println("Registering Swedish Buyer with Mediator...");
}
public void registerAmericanSeller(Seller americanSeller){
    this.americanSeller = americanSeller;
    System.out.println("Registering American Seller with Mediator...");
}
public boolean placeBid(double amount, String currency){
    System.out.println("Attempting to place bid for "+amount+" "+currency);
    if(currency.equals(frenchBuyer.currency)){
        return americanSeller.isBidAccepted(dollarConverter.convertEurosToDollars(amount));
    }else{
        return americanSeller.isBidAccepted(dollarConverter.convertKronorToDollars(amount));
    }
}
}
