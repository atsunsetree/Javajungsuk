package ch07;

class Outer2 {
    static class Inner {
        int iv=200;
    }
}

public class ex26 {
    public static void main(String[] args) {
        Outer2.Inner outerInner = new Outer2.Inner();
        System.out.println(outerInner.iv);
    }
}
