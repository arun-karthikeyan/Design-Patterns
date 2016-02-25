package behavioral.command;

public class LunchCommand implements Command {

    Lunch lunch;
    public LunchCommand(Lunch lunch) {
        // TODO Auto-generated constructor stub
        this.lunch = lunch;
    }
    @Override
    public void execute() {
        lunch.makeLunch();
        
    }

}
