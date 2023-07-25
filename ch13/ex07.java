package ch13;

public class ex07
{
    static boolean stopped = false;

    public static void main(String[] args)
    {
        Thread5 th1 = new Thread5();
        th1.start();
        try {
            Thread.sleep(6 * 1000);
        } catch (Exception e) {
        }
        stopped = true; // 쓰레드를 정지시킨다. (stopped가 true가 됐을때 즉시)
        th1.interrupt();
        System.out.println("stopped");
    }
}

class Thread5 extends Thread {
    public void run() {
        // Exercise13_7.stopped의 값이 false인 동안 반복한다.
        for (int i = 0; !ex07.stopped; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3 * 1000);
            } catch (Exception e) { }
        }
    } // run()
}

/*before
0
1
stopped

after도 똑같이 나옴...
 */