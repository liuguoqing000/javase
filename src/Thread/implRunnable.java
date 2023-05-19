package Thread;

/**
 * @author 刘国庆
 * @date 2023/5/17
 * @desc 通过实现Runnable接口创建线程
 */
public class implRunnable {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程叫" + i + "@" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("狗叫" + i + "@" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/* 模拟静态代理 */
class threadProxy implements Runnable {
    Runnable target = null;

    public threadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (this.target != null) {
            this.target.run();
        }
    }

    public void start() {
        start0();
    }

    public void start0() {
        // 此处还有一些创建线程之类的源码
        this.run();
    }

}
