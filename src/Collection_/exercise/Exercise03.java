package Collection_.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguoqing000
 * @date 2023/5/29 19:39
 * @desc
 */
public class Exercise03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);
        System.out.println("1." + map);
        map.put("jack", 2600);
        System.out.println("2." + map);

        System.out.print("3.");
        Set keySet = map.keySet();
        for (Object key : keySet) {
            map.put(key, (int) map.get(key) + 100);
            System.out.print(" key=" + key);
        }

        Collection values = map.values();
        System.out.print("\n4.");
        for (Object value : values) {
            System.out.print(" value=" + value);
        }

        System.out.print("\n5.");
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            System.out.print(" key=" + entry.getKey() + " value=" + entry.getValue());
        }
    }
}
/**
 * 按要求完成下列任务
 * 1）使用HashMap类实例化一个Map类型的对象m，键（String）和值（int）分别用于存储员工的姓名和工资，
 * 存入数据如下：	jack—650元；tom—1200元；smith——2900元；
 * 2）将jack的工资更改为2600元
 * 3）为所有员工工资加薪100元；
 * 4）遍历集合中所有的员工
 * 5）遍历集合中所有的工资
 */
