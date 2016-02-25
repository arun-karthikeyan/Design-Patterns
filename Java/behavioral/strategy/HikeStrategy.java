package behavioral.strategy;

public class HikeStrategy implements Strategy {

    @Override
    public boolean checkTemperature(int temperature) {
        // TODO Auto-generated method stub
        if(temperature>21 && temperature <=26){
            return true;
        }
        return false;
    }

}
