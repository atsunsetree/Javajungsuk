package ch06;

public class ex24 {
    private static int abs(int value) {
        int result = 0;
        if(value<0) {
            result = -(value);
        } else {
            result = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
