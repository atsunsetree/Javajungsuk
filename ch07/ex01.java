package ch07;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < 20; i++) {
            boolean isKwang = false;
            if (i == 0 || i == 2 || i == 7) {
                isKwang = true;
            }
            cards[i] = new SutdaCard(i < 10 ? i + 1 : i - 9, isKwang);
        }
    }

    public void shuffle() {
        int randomNum = (int)(Math.random() * CARD_NUM);
        for (int i = 0; i < cards.length; i++) {
            SutdaCard tmp = cards[i];
            cards[i] = cards[randomNum];
            cards[randomNum] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        if(index < 0 || index >= CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    public SutdaCard pick() {
        return cards[(int)(Math.random() * CARD_NUM)];
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class ex01 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
