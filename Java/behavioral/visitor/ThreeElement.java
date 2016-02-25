package behavioral.visitor;

public class ThreeElement implements NumberElement {

    int a;
    int b;
    int c;
    public ThreeElement(int a, int b, int c) {
        // TODO Auto-generated constructor stub
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    @Override
    public void accept(NumberVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }

}
