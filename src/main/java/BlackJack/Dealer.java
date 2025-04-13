package BlackJack;

/**
 * Дилер
 */
public class Dealer extends Player {
    public Dealer( String name) {
       super(name);
    }


    @Override
    public boolean doYouNeedMoreCard() {
        if(countValueInHand() < 17) {
            return true;
        }
        return false;
    }
}
