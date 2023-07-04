package new_features;

import org.junit.Test;

/**
 * @author liuguoqing000
 * @date 2023/7/4 19:10
 * @desc switch中->、使用yield作为表达式
 */
public class switch_ {
    @Test
    public void m1() {
        String str = "c";
        int val = switch (str) {
            case "a" -> {
                yield 1;
            }
            case "b" -> 2;
            case "c" -> {
                System.out.println("matched!");
                yield 3;
            }
            default -> {
                System.out.println("no one matched!");
                yield -1;
            }
        };
        System.out.println(val);
    }
}
