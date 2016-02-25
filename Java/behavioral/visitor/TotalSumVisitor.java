package behavioral.visitor;

import java.util.Iterator;
import java.util.List;

public class TotalSumVisitor implements NumberVisitor {

    int totalSum;
    public TotalSumVisitor() {
        // TODO Auto-generated constructor stub
        totalSum = 0;
    }
    @Override
    public void visit(TwoElement twoElement) {
        System.out.println("Adding "+twoElement.a+" and "+twoElement.b+" to total...");
        totalSum += twoElement.a + twoElement.b;
        
    }

    @Override
    public void visit(ThreeElement threeElement) {
        // TODO Auto-generated method stub
        System.out.println("Adding "+threeElement.a+" , "+threeElement.b+" and "+threeElement.c+" to the total...");
        totalSum += threeElement.a + threeElement.b + threeElement.c;
        
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        // TODO Auto-generated method stub
        Iterator<NumberElement> elements = elementList.iterator();
        while(elements.hasNext()){
            elements.next().accept(this);
        }
    }
    
    public int getTotalSum(){
        return totalSum;
    }

}
