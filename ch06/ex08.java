package ch06;

public class ex08 {
}

class PlayingCard {
    int kind;
    int num;
    static int width;
    static int height;

    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }

    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}

//클래스: width, height
//인스턴스: kind, num
//지역변수: k, n, card, args
