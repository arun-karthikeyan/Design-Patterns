package behavioral.iterator;

public class Item {
String name;
int price;
    public Item(String name, int price) {
    // TODO Auto-generated constructor stub
    this.name = name;
    this.price = price;
   }
    public String toString(){
        return name + " : Rs." + price;
    }
}
