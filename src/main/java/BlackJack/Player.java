package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Игрок
 */
public class Player {
    private String name;
    private ArrayList<Card> cardList = new ArrayList();
    private boolean canWin = true;

    Player(){};
    Player(String name) {
        this.name = name;
    }

    /**
     * Установи имя
     *
     * @param name значение String, которое установится в качестве имени
     */
    public void setName(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public boolean doYouNeedMoreCard() {
        System.out.printf("%s, ваши карты -----------\n", name);
        openHand();
        System.out.println("Хотите взять карту");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("Да")) {
            return true;
        }
        return false;
    }

    public void  openHand() {
        for (Card card : cardList) {
            System.out.println(card);
        }
    }

    public int countValueInHand() {
        int count = 0;
        for (Card card : cardList) {
            count += card.getValue();
        }
        return count;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public String getName() {
        return name;
    }
}
