package ch13;

public class ex02 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.run();

        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
    }
}

//실행결과 01234567890123456789 -> 답 b
