package thread;

/**
 * @author 刘国庆
 * @date 2023/5/17
 * @desc join插队:优先完成插队者再完成其它
 */

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new A1());
        if (Thread.State.TERMINATED != t1.getState()) {

        }

        t1.setDaemon(true);
        t1.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5) {
                t1.start();
                t1.join();
            }
        }

        System.out.println("主线程结束");
    }
}

class A1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("打断");
            }
        }
        System.out.println("子线程结束");
    }
}