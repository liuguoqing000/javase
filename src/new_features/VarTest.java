package new_features;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguoqing000
 * @date 2023/7/4 17:17
 * @desc 局部变量类型推断var，使用场景
 */
public class VarTest {

    @Test
    public void m1() {
        /* 1.局部变量实例化 */
        var strings = new ArrayList<>();
        /* 2.增强for循环中的索引 */
        for (var string : strings) {
            System.out.println(string);
        }
        /* 3.传统for循环中*/
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }
        /*4.返回值类型为复杂范型结构时*/
        HashMap<String, String> map = new HashMap<>();
        Set<Map.Entry<String, String>> entries1 = map.entrySet();
        var entries2 = map.entrySet();
    }
}
