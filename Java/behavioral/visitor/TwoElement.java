package behavioral.visitor;

public class TwoElement implements NumberElement {

    int a;
    int b;
    
    public TwoElement(int a, int b) {
        // TODO Auto-generated constructor stub
        this.a = a;
        this.b = b;
    }
    @Override
    public void accept(NumberVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }

}
