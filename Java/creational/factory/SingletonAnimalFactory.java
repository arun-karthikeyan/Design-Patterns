package creational.factory;

public class SingletonAnimalFactory {
private static SingletonAnimalFactory animalFactory = null;
private SingletonAnimalFactory(){
}
public static SingletonAnimalFactory getInstance(){
    if(animalFactory==null){
        animalFactory = new SingletonAnimalFactory();
    }
    return animalFactory;
}

public Animal getInstance(String type){
    if("canine".equals(type)){
        return new Dog();
    }else{
        return new Cat();
    }
}
}
