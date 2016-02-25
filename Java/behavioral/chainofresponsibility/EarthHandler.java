package behavioral.chainofresponsibility;

public class EarthHandler extends PlanetHandler{

    @Override
    public void handleRequest(PlanetEnum request) {
        // TODO Auto-generated method stub
        if(PlanetEnum.EARTH==request){
            System.out.println("Earth handler handles request "+request);
            System.out.println("Earth is sustainable");
        }else{
            System.out.println("Earth handler can't handle request "+request);
            if (super.successor != null) {
                super.successor.handleRequest(request);
            } else {
                System.out.println("End of Chain, Request was not handled");
            }
        }
    }

}
