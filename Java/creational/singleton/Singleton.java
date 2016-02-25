package creational.singleton;

public class Singleton {

    private static Singleton singleton = null; 
    private Singleton() {

    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public void printSomething(){
        System.out.println("This is a Singleton Class");
    }
}
