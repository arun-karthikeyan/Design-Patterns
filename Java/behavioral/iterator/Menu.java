package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
List<Item> menuList;
public Menu() {
    // TODO Auto-generated constructor stub
    menuList = new ArrayList<Item>();
}
public MenuIterator iterator(){
    return new MenuIterator();
}
public boolean add(Item item){
    return menuList.add(item);
}
    class MenuIterator implements Iterator<Item>{
    int index = 0;

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index<menuList.size();
    }

    @Override
    public Item next() {
        return menuList.get(index++);
    }

    @Override
    public void remove() {
        menuList.remove(--index);
        
    }
    
}
}
