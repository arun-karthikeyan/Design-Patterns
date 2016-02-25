package creational.builder;
//The Product class
public class Meal {
private String drink;
private String side;
private String main;
public Meal(){
   
}
public String getDrink(){
    return drink;
}
public void setDrink(String drink){
    this.drink = drink; 
}
public String getSide(){
    return side;
}
public void setSide(String side){
    this.side = side;
}
public String getMain(){
    return main;
}
public void setMain(String main){
    this.main = main;
}
public String toString(){
    return "Main : "+this.main+"; Side : "+this.side+"; Drink : "+this.drink;
}
}
