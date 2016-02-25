package behavioral.state;

public class HappyState implements EmotionalState {

    @Override
    public void sayHi() {
        // TODO Auto-generated method stub
        System.out.println("Hello Man :D How are you ??");
        
    }

    @Override
    public void sayBye() {
        // TODO Auto-generated method stub
        System.out.println("See you, Take care :)");
        
    }

}
