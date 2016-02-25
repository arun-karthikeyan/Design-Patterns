package behavioral.command;

public class DinnerCommand implements Command {
    Dinner dinner;
    public DinnerCommand(Dinner dinner) {
        // TODO Auto-generated constructor stub
        this.dinner = dinner;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        dinner.doDinner();        
    }

}
