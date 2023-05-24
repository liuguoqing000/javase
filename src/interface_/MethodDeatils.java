package interface_;

/**
 * @author 刘国庆
 * @date 2023/5/20
 * @desc 接口方法定义细节
 */

public class MethodDeatils {
    public static void main(String[] args) {

    }
}

interface I1 {
    void m1();

    void m2();

    public default void m3() {
    }

    public static void m4() {
    }
}

class A implements I1 {
    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }
}
