package CommonClass;

import java.util.Arrays;
import java.util.List;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc Array类常用方法2
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 567};
        // 1.binarySearch 通过二分搜索法进行查找，要求为有序数组
        // 如果数组中不存在该元素，就返回 return -(low + 1);  // key not found.
        int index = Arrays.binarySearch(arr, 3);

        //2.copyOf 数组元素的复制
        //从 arr 数组中，拷贝 arr.length个元素到 newArr数组中
        //如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
        //如果拷贝长度 < 0 就抛出异常NegativeArraySizeException
        //该方法的底层使用的是 System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, arr.length);


        //3. equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1, 2, 90, 123};
        boolean equals = Arrays.equals(arr, arr2);

        //asList 将一组值，转换成list
        //老韩解读
        //1. asList方法，会将 (2,3,4,5,6,1)数据转成一个List集合
        //2. 返回的 asList 编译类型 List(接口)
        //3. asList 运行类型 java.util.Arrays#ArrayList, 是Arrays类的
        List asList = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println("asList的运行类型" + asList.getClass());
    }
}

