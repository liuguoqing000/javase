package Collection_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author liuguoqing000
 * @date 2023/5/29 15:42
 * @desc
 */
public class TreeSetMethods {
    public static void main(String[] args) {
        new TreeSetMethods().m();
    }

    public void m() {
        //默认按ASCII从小到大排序
        //可使用匿名内部类修改排序规则
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeSet.add("abcdefg");
        treeSet.add("zbfg");
        treeSet.add("kbg");
        treeSet.add("fddfabcdefg");
        System.out.println(treeSet);
    }
}
