package collection_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author liuguoqing000
 * @date 2023/5/29 16:03
 * @desc
 */
public class TreeMapMethods {
    public static void main(String[] args) {
        new TreeMapMethods().m();
    }

    public void m() {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            // 此处按照字符串长度排序，但key长度相同的就不会被添加了
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("amy", "8");
        treeMap.put("tom", "1");
        treeMap.put("jerry", "2");
        treeMap.put("john", "9");
        System.out.println(treeMap);
    }
}
