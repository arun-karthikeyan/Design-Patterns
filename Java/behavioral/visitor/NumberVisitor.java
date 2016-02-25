package behavioral.visitor;

import java.util.List;

public interface NumberVisitor {
public void visit(TwoElement twoElement);
public void visit(ThreeElement threeElement);
public void visit(List<NumberElement> elementList);
    
}
