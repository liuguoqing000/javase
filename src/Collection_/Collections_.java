package Collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author liuguoqing000
 * @date 2023/5/29 16:14
 * @desc
 */
public class Collections_ {
    public static void main(String[] args) {
        new Collections_().m();
    }

    public void m() {
        List list = new ArrayList();
        list.add("tom");
        list.add("amy");
        list.add("king");
        list.add("jack");

        //反转
        Collections.reverse(list);
        //随机排序
        Collections.shuffle(list);
        //按自然顺序排序
        Collections.sort(list);
        //自定义排序规则
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o1).length();
            }
        });
        //交换元素位置
        Collections.swap(list, 1, 2);
        //根据元素的自然排序返回最大值
        Collections.max(list);
        //根据自定义排序规则返回最大值
        Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o1).length();
            }
        });
        //min同理
        //返回指定元素的出现次数
        Collections.frequency(list, "tom");
        //拷贝list到dest中
        //为防止异常，dest长度需大于list
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);

        //替换值
        Collections.replaceAll(list, "tom", "汤姆");
    }
}
