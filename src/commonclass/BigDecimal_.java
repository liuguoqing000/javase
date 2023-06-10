package commonclass;

import java.math.BigDecimal;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc BigDecimal
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.11");
        BigDecimal bigDecimal2 = new BigDecimal("3");

        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        System.out.println(bigDecimal.divide(bigDecimal2));//可能抛出异常ArithmeticException
    }
}
