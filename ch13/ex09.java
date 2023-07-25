package ch13;

import javax.swing.*;

public class ex09 {
    public static void main(String[] args) throws Exception {
        ex09_1 th1 = new ex09_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt(); // 쓰레드에게 작업을 멈추라고 요청한다.
    }
}

class ex09_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);

            try {
                Thread.sleep(1000); // 1초 지연
            } catch (InterruptedException e) {
                interrupt(); //InterruptedException을 발생하게 해 입력 즉시 종료되도록 한다
            }
        }
        System.out.println("카운트가 종료되었습니다.");
    } // main
}
