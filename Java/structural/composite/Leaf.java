package structural.composite;

public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Leaf " + this.name + " says Hello");

    }

    @Override
    public void sayGoodBye() {
        // TODO Auto-generated method stub
        System.out.println("Leaf " + this.name + " says GoodBye");
    }

}
