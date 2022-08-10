package homework.task1.task5;

import homework.task1.task5.container.Container;

public class Deck extends Container {

    boolean singleDeck;
    boolean doubleDeck;

    public Deck(){

    }

    public Deck(boolean singleDeck, boolean doubleDeck){
        setSingleDeck(singleDeck);
        setDoubleDeck(doubleDeck);
    }

    public void setSingleDeck(boolean singleDeck) {
        this.singleDeck = singleDeck;
    }

    public void setDoubleDeck(boolean doubleDeck) {
        this.doubleDeck = doubleDeck;
    }
}
