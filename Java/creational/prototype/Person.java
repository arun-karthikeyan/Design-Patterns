package creational.prototype;

public class Person implements Prototype {

    String name;
    public Person(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }
    public String toString(){
        return "This Person's name : "+this.name;
    }
    public void changeToNewName(String newName){
        this.name = newName;
    }
    @Override
    public Prototype doClone() {
        // TODO Auto-generated method stub
        return new Person(this.name);
    }

}
