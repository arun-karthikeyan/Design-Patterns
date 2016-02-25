package structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static FlyweightFactory fac = null;
    private HashMap<String, Flyweight> objectPool;

    private FlyweightFactory() {
        objectPool = new HashMap<String, Flyweight>();
        // TODO Auto-generated constructor stub
    }

    public static FlyweightFactory getInstance() {
        if (fac == null) {
            fac = new FlyweightFactory();
        }
        return fac;

    }

    public Flyweight getObject(String opKey) {
        if (objectPool.containsKey(opKey)) {
            return objectPool.get(opKey);
        } else {
            Flyweight fly;
            if ("add".equals(opKey)) {
                fly = new FlyweightAdder();
            } else {
                fly = new FlyweightMultiplier();
            }
            objectPool.put(opKey, fly);
            return fly;
        }
    }
}
