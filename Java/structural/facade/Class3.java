package structural.facade;

public class Class3 {
public int doMoreStuff(Class1 class1, Class2 class2, int x){
    return class1.doSomething(x)*class2.doSomethingElse(class1, x);
}
}
