package new_features;

import org.junit.Test;

/**
 * @author liuguoqing000
 * @date 2023/7/4 19:10
 * @desc instanceof
 */
public class instance_of {
    @Test
    public void m1() {
        Object o = new String("hhh");
        // 以前
        if (o instanceof String) {
            String str = (String) o;
            System.out.println(((String) o).length());
        }

        // 现在
        if (o instanceof String str) {
            System.out.println(((String) o).length());
        }
    }
}
