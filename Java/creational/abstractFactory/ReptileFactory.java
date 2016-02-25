package creational.abstractFactory;

public class ReptileFactory extends SpeciesFactory {

    private static ReptileFactory repFac = null;
    @Override
    public Animal getAnimal(String type) {
        if("snake".equals(type)){
            return new Snake();
        }
        else{
            return new Raptor();
        }
    }
    public static ReptileFactory getInstance(){
        if(repFac==null){
            repFac = new ReptileFactory();
        }
        return repFac;
    }

}
