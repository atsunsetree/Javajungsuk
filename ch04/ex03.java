package ch04;

public class ex03 {
    public static void main(String[] args) {
        int res = 0;
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(res += sum);
    }
}
