package reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author liuguoqing000
 * @date 2023/6/1 09:02
 * @desc 通过反射访问field、method、class、constructor
 */
public class intro {
    public static void main(String[] args) throws Exception {
        /* 读取配置文件 */
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classpath = properties.get("classpath").toString();
        String methodName = properties.get("method").toString();
        String fieldName = properties.get("field").toString();

        /* Class */
        Class cls = Class.forName(classpath);

        /* 创建实例 */
        Object o = cls.getDeclaredConstructor().newInstance();
        System.out.println("运行类型：" + o.getClass().getSimpleName());

        /* Method */
        Method method = cls.getMethod(methodName);
        method.invoke(o);

        /* Field */
        //以目前的知识，只能获得public属性
        Field field = cls.getField(fieldName);
        //get方法返回指定对象上此 Field 表示的字段的值
        //getName方法返回字段的名字
        System.out.println("成员变量" + field.getName() + "的值为" + field.get(o));

        /* Constructor */
        //1.无参构造器
        Constructor constructor = cls.getConstructor();
        System.out.println("无参构造器：" + constructor);
        //2.有参构造器：若为构造器参数若为int类型，需要改为Integer，以和Integer.class一致
        Constructor constructor1 = cls.getConstructor(Integer.class);//有参构造器
        System.out.println("有参构造器：" + constructor1);
    }
}
