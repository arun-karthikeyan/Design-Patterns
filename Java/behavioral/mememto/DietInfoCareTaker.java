package behavioral.mememto;

public class DietInfoCareTaker {
Object memento;
public void save(DietInfo dietInfo){
    memento = dietInfo.save();
}
public void restore(DietInfo dietInfo){
    dietInfo.restore(memento);
}
}
