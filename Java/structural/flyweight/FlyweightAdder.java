package structural.flyweight;

public class FlyweightAdder implements Flyweight {
    String operation;
    public FlyweightAdder() {
        // TODO Auto-generated constructor stub
        try{
            Thread.sleep(3000);
            operation = "Addition";
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void doMath(int a, int b) {
        // TODO Auto-generated method stub
        System.out.println(operation+" of "+a+" and "+b+" is "+(a+b));
    }

}
