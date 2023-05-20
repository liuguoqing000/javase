package thread;

/**
 * @author 刘国庆
 * @date 2023/5/17
 * @desc 通过继承Thread创建线程
 */
public class ExtendThread {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pig pig = new Pig();
        cat.start();
        pig.start();
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("猫叫" + i + "@" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Pig extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("猪叫" + i + "@" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}