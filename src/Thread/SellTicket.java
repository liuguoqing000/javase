package Thread;

/**
 * @author 刘国庆
 * @date 2023/5/17
 * @desc
 */

public class SellTicket {
    public static void main(String[] args) {
        Count1 c1 = new Count1();
        c1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        c1.setLoop(false);
        System.out.println("线程终止");
    }
}

class Count1 extends Thread {
    private int count = 1;
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println("计数" + (count++));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}