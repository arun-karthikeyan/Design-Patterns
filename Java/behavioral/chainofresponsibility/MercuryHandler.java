package behavioral.chainofresponsibility;

public class MercuryHandler extends PlanetHandler {

    @Override
    public void handleRequest(PlanetEnum request) {
        if(request==PlanetEnum.MERCURY){
            System.out.println("Mercury Handler handles request "+request);
            System.out.println("Mercury is frekin hot");
        }else{
            System.out.println("Mercury Handler can't handle request "+request);
            if (super.successor != null) {
                super.successor.handleRequest(request);
            } else {
                System.out.println("End of Chain, Request was not handled");
            }
        }
        
    }

}
