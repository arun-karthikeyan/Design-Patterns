package behavioral.command;

public class MealInvoker {
Command command;
public MealInvoker(Command command) {
    // TODO Auto-generated constructor stub
    this.command = command;
}
public void invoke(){
    command.execute();
}
public void setCommand(Command command){
    this.command = command;
}
}
