package structural.facade;

public class Facade {
public int getCube(int x){
    Class1 class1 = new Class1();
    return class1.doSomething(x);
}
public int getTwiceCube(int x){
    Class1 class1 = new Class1();
    Class2 class2 = new Class2();
    return class2.doSomethingElse(class1, x);
}
public int getTwiceSixthPower(int x){
    Class1 class1 = new Class1();
    Class2 class2 = new Class2();
    Class3 class3 = new Class3();
    return class3.doMoreStuff(class1, class2, x);
}
}
