package BlackJack;

import java.util.Objects;

/**
 * Карта
 */
public class Card {
    private String nominal;
    private int value;

    public Card() {

    }

    public Card(String nominal, int value) {
        this.nominal = nominal;
        this.value = value;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(nominal, card.nominal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, value);
    }

    @Override
    public String toString() {
        return "Карта \n" +
                "номинал='" + nominal + '\'' +
                ", очки=" + value +
                '}';
    }
}
