package BlackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ричард");
        Player player2 = new Player("Зина");
        Player player3 = new Player("Антон");

        Dealer dealer = new Dealer("Диллер");


        BlackJack blackJack = new BlackJack();
        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);
        blackJack.addPlayer(player3);
        blackJack.addPlayer(dealer);


//        Deck deck = new Deck(); //Ожидается, что внутри колоды 52 карты
//        deck.prepare(); //Наполнили колоду 52 картами

        blackJack.dealTwoCardsAllPlayers();
        blackJack.dealRestCardsToAllPlayers();
        blackJack.printWinner();
//        //Одно и то же
//        Card card = deck.getRandomCard();
//        String nominal = card.getNominal();
//        System.out.println(nominal);
//        // Одно и то же
//        System.out.println(deck.getRandomCard().getNominal());


    }
}
