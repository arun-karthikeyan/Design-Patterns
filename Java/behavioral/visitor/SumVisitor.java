package behavioral.visitor;

import java.util.Iterator;
import java.util.List;

public class SumVisitor implements NumberVisitor {

    @Override
    public void visit(TwoElement twoElement) {
        System.out.println(twoElement.a+" + "+twoElement.b+" = "+(twoElement.a+twoElement.b));
        
    }

    @Override
    public void visit(ThreeElement threeElement) {
        // TODO Auto-generated method stub
        System.out.println(threeElement.a+" + "+threeElement.b+" + "+threeElement.c+" = "+(threeElement.a + threeElement.b + threeElement.c));
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        // TODO Auto-generated method stub
        Iterator<NumberElement> elements = elementList.iterator();
        while(elements.hasNext()){
            elements.next().accept(this);
        }
    }

}
