package behavioral.chainofresponsibility;

public class VenusHandler extends PlanetHandler {

    @Override
    public void handleRequest(PlanetEnum request) {
        // TODO Auto-generated method stub
        if (PlanetEnum.VENUS == request) {
            System.out.println("Venus handler handles request " + request);
            System.out.println("Venus is Poisonous");
        } else {
            System.out.println("Venus handler can't handle request " + request);
            if (super.successor != null) {
                super.successor.handleRequest(request);
            } else {
                System.out.println("End of Chain, Request was not handled");
            }
        }
    }

}
