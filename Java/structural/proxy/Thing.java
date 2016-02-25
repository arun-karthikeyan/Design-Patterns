package structural.proxy;

import java.util.Date;

public abstract class Thing {
    
    public void sayHello(){
        System.out.println(this.getClass().getSimpleName()+" says Hello at "+ new Date());
    }

}
