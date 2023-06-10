package commonclass;

import java.math.BigInteger;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc BigInteger
 */
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("23");
        BigInteger bigInteger2 = new BigInteger("10");

        // 加
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        // 减
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);
        // 乘
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);
        //除
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);
    }
}
