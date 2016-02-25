package behavioral.state;

public class Person implements EmotionalState {
EmotionalState state;
public Person(EmotionalState state) {
    // TODO Auto-generated constructor stub
this.state = state;
}
@Override
public void sayHi() {
    // TODO Auto-generated method stub
    state.sayHi();
    
}
@Override
public void sayBye() {
    // TODO Auto-generated method stub
    state.sayBye();
}

public void setState(EmotionalState state){
    this.state = state;
}
}
