package behavioral.command;

public class BreakfastCommand implements Command {
    Breakfast breakfast;
    public BreakfastCommand(Breakfast breakfast) {
        // TODO Auto-generated constructor stub
        this.breakfast = breakfast;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
    breakfast.doBreakfast();
    }

}
