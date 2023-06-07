package ch04;

public class ex06 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println(i + "+" + j + "=6");
                    cnt++;
                }
            }
        }
        System.out.println("경우의 수: " + cnt);
    }
}
