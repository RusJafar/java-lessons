package BlackJack;

import java.util.ArrayList;

/**
 * Игра
 */
public class BlackJack {
    private Deck deck = new Deck();

    private ArrayList<Player> players = new ArrayList();

    public BlackJack() {
        deck.prepare();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addPlayer(ArrayList<Player> playersList) {
        players.addAll(playersList);
    }

    public void dealTwoCardsAllPlayers() {
        for (Player player : players) {
            player.addCard(deck.getRandomCard());
            player.addCard(deck.getRandomCard());
        }
    }

    public void dealRestCardsToAllPlayers() {
        for (Player player : players) {
            while(player.doYouNeedMoreCard()) {
                player.addCard(deck.getRandomCard());
            }
        }
    }

    public void printWinner() {
        for (Player player : players) {
            if(player.countValueInHand() > 21) {
                player.setCanWin(false);
            }
        }
        if(countPlayersWhoCanWins() == 0) {
            for (Player player : players) {
                if(player instanceof Dealer) {
                    System.out.println(player.getName());
                    player.openHand();
                    return;
                }
            }
        }

        int winnerValue = 0;
        for (Player player : players) {

            if(player.isCanWin() && player.countValueInHand() > winnerValue) {
                winnerValue = player.countValueInHand();
            }
        }

        for (Player player : players) {
            if(player.countValueInHand() == winnerValue) {
                System.out.println("Игрок " + player.getName()+ "выйгал");
            }
        }
    }

    public int countPlayersWhoCanWins() {
        int count = 0;
        for (Player player : players) {
            if(player.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
