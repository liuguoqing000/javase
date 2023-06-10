package commonclass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc Array类常用方法2
 */
public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers = {1, 20, 90};
        //1.遍历数组
        System.out.println(Arrays.toString(integers));
        //2.排序
        Integer arr[] = {1, -1, 7, 0, 89};
        // 默认排序方法
        Arrays.sort(arr);
        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
    }
}
