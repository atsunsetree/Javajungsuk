package ch13;

public class ex06 {
    public static void main(String[] args) throws Exception
    {
        Thread4 th1 = new Thread4();
        th1.setDaemon(true); //5번과 달리 데몬스레드 실행
        th1.start();
        try {
            Thread.sleep(5*1000); // main쓰레드를 5초간 정지시킨다
        } catch(Exception e) {}
        throw new Exception(" 꽝~!!!");
    }
}

class Thread4 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    } // run()
}

/*
0
1
2
3
4
Exception in thread "main" java.lang.Exception:  꽝~!!!
	at ch13.ex06.main(ex06.java:12)
 */