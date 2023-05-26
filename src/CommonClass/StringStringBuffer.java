package CommonClass;

/**
 * @author 刘国庆
 * @date 2023/5/25
 * @desc String 和 StringBuffer的相互转换
 */
public class StringStringBuffer {
    public static void main(String[] args) {
        /* StringBuffer -> StringBuffer */
        String str = "abc";
        // 1.构造器(未改变str原值)
        StringBuffer stringBuffer = new StringBuffer(str);
        // 2.使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        /* StirngBuffer -> String*/
        // 1.使用stringBuffer的toString方法
        str = stringBuffer.toString();
        // 2.String的构造器
        String str1 = new String(stringBuffer1);
    }
}
