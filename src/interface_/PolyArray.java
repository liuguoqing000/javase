package interface_;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc 接口多态数组
 */

public class PolyArray {
    public static void main(String[] args) {
        Usb[] usb = new Usb[2];
        usb[0] = new Phone();
        usb[1] = new Camera();
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if (usb[i] instanceof Phone) {
                // 向下转型
                ((Phone) usb[i]).call();
            }
        }
    }
}

interface Usb {
    void work();
}

class Phone implements Usb {

    @Override
    public void work() {
        System.out.println("手机插入usb");
    }

    public void call() {
        System.out.println("打电话");
    }
}

class Camera implements Usb {

    @Override
    public void work() {
        System.out.println("相机插入usb");
    }
}