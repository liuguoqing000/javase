package CommonClass;

/**
 * @author 刘国庆
 * @date 2023/5/25
 * @desc StringBuffer的常用方法
 */
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        // 1.
        stringBuffer.append("world");
        // 2.删除[1,5)的字符
        stringBuffer.delete(1, 3);
        // 3.将[1,3)的字符替换为el
        stringBuffer.replace(1, 3, "el");
        // 4.
        stringBuffer.indexOf("el");
        // 5.在索引为2处插入aaa，原有内容向后移
        stringBuffer.insert(2, "aaa");
        // 6.
        stringBuffer.length();
        StringBuilder stringBuilder = new StringBuilder("good");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
    }
}
