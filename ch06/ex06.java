package ch06;

public class ex06 {
    static double getDistance(int x, int y, int x1, int y1) {
        int a = x1 - x;
        int b = y1 - y;
        double result = Math.sqrt(a*a+b*b);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
