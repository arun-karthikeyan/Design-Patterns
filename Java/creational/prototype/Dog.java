package creational.prototype;

public class Dog implements Prototype {

    String sound;
    public Dog(String sound) {
        // TODO Auto-generated constructor stub
        this.sound = sound;
    }
    public String toString(){
        return "This Dog says : "+this.sound;
    }
    public void setSound(String newSound){
        this.sound = newSound;
    }
    @Override
    public Prototype doClone() {
        // TODO Auto-generated method stub
        return new Dog(this.sound);
    }
    

}
