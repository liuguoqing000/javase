package thread;

/**
 * @author 刘国庆
 * @date 2023/5/19
 * @desc 超卖问题, 已解决!!!
 */

public class SellTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.setName("1号窗口");
        t2.setName("2号窗口");
        t3.setName("3号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    private int ticketCount = 10;
    private boolean loop = true;

    private synchronized void sell() {
        if (ticketCount == 0) {
            this.loop = false;
            return;
        }
        ticketCount--;
        System.out.println(Thread.currentThread().getName() + "卖出1张票，余" + ticketCount + "张票");
    }

    @Override
    public void run() {
        // 卖一张票后休息，然后让其它窗口卖，自己休息完了继续循环即卖票
        while (loop) {
            sell();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 退出循环说明活干完了,关闭窗口
        System.out.println(Thread.currentThread().getName() + "关闭");
    }
}