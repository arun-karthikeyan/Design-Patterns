package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
List<Component> components;
public Composite() {
components = new ArrayList<Component>();
}
@Override
public void sayHello() {
    for(Component c : components){
        c.sayHello();
    }
    // TODO Auto-generated method stub
    
}
@Override
public void sayGoodBye() {
    // TODO Auto-generated method stub
    for(Component c : components){
        c.sayGoodBye();
    }
}

public boolean addComponent(Component component){
    return components.add(component);
}

public Component getComponent(int index){
    return components.get(index);
}
public boolean removeComponent(Component component){
    return components.remove(component);
}
}
