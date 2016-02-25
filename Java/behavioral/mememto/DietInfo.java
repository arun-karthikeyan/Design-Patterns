package behavioral.mememto;

public class DietInfo {
String name;
int week;
int weight;
public DietInfo(String name, int week, int weight) {
    this.name = name;
    this.week = week;
    this.weight = weight;
    // TODO Auto-generated constructor stub
}
public Object save(){
    return new DietMemento(this.name,this.week,this.weight);
}
public void restore(Object objMem){
    DietMemento memento = (DietMemento)objMem;
    this.name = memento.nameSave;
    this.week = memento.weekSave;
    this.weight = memento.weightSave;
}
public void setWeekandWeight(int week, int weight){
    this.week = week;
    this.weight = weight;
}
public String toString(){
    return "Name : "+name+"; Week : "+week+"; Weight : "+weight;
}
private class DietMemento{
String nameSave;
int weekSave;
int weightSave;
public DietMemento(String nameSave, int weekSave, int weightSave){
    this.nameSave = nameSave;
    this.weekSave = weekSave;
    this.weightSave = weekSave;
}
}
}
