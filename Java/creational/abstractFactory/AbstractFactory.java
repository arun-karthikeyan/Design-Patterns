package creational.abstractFactory;

public class AbstractFactory {
private AbstractFactory(){
    
}
public static SpeciesFactory getSpeciesFactory(String type){
    if("mammal".equals(type)){
        return MammalFactory.getInstance();
    }else{
        return ReptileFactory.getInstance();
    }
}
}
