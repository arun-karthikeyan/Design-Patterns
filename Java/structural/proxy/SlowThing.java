package structural.proxy;

public class SlowThing extends Thing {
public SlowThing() {
    // TODO Auto-generated constructor stub
    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
}
}
