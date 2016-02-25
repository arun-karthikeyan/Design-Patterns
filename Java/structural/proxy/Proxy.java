package structural.proxy;

import java.util.Date;

public class Proxy {
SlowThing slowThing;
    public Proxy() {
    // TODO Auto-generated constructor stub
        System.out.println("Creating "+this.getClass().getSimpleName()+" at "+new Date());
}
public void sayHello(){
    if(slowThing==null){
        slowThing = new SlowThing();
    }
    slowThing.sayHello();
}
}
