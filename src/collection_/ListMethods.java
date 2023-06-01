package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuguoqing000
 * @date 2023/5/27 19:47
 * @desc
 */
public class ListMethods {
    public static void main(String[] args) {
        new ListMethods().m1();
    }

    public void m1() {
        List list = new ArrayList();
        list.add("诸葛孔明");
        list.add("刘玄德");
        // 在指定索引处插入单个元素
        list.add(0, "曹孟德");
        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("jerry");
        list.add(list2);
        // 在指定索引处插入多个元素
        list.addAll(1, list2);
        // 返回指定元素第一次出现的索引
        System.out.println(list.indexOf("tom"));
        // 返回指定元最后一次出现的索引
        System.out.println(list.lastIndexOf("jerry"));
        // 删除
        list.remove(1);
        // 通过索引替换元素
        list.set(1, "mary");
        // 截取[2,4)
        System.out.println(list.subList(2, 4));















        /* 查看指定元素 */
        System.out.println(list);
        /* 添加 */
        // 1.单个元素添加

        // 2.多个元素添加
        list.addAll(list2);
    }
}
