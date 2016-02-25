package creational.abstractFactory;

public class MammalFactory extends SpeciesFactory {

    private static MammalFactory mamFac= null;
    private MammalFactory() {
        // TODO Auto-generated constructor stub
    }
    public static MammalFactory getInstance(){
        if(mamFac==null){
            mamFac = new MammalFactory();
        }
        return mamFac;
    }
    @Override
    public Animal getAnimal(String type) {
        if("canine".equals(type)){
            return new Dog();
        }else{
            return new Cat();
        }
        
    }

}
