package reflection;

import java.lang.reflect.Field;

/**
 * @author liuguoqing000
 * @date 2023/6/1 11:26
 * @desc
 */
public class ClassMethods {
    public static void main(String[] args) throws Exception {
        //指定类路径
        String classPath = "reflection.Person";
        //通过反射创建类对象
        Class<?> cls = Class.forName(classPath);
        System.out.println("对象所属类：" + cls);
        System.out.println("运行类型：" + cls.getClass());
        System.out.println("包名：" + cls.getPackage().getName());
        System.out.println("类名：" + cls.getName());
        //通过反射创建实例
        Object o = cls.getDeclaredConstructor().newInstance();
        //通过反射获得属性
        Field name = cls.getField("name");

        //修改字段值
        //getName()获得字段名
        //name.get(o)获得传入对象的字段值，类似o.getName()
        System.out.println("修改前" + name.getName() + "值：" + name.get(o));
        name.set(o, "bbb");
        System.out.println("修改后" + name.getName() + "值：" + name.get(o));
    }
}
