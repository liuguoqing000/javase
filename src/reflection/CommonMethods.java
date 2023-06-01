package reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @author liuguoqing000
 * @date 2023/6/1 11:26
 * @desc 常用方法，分为Class、Field、Method、Constructor四种
 */
public class CommonMethods {
    //指定类路径
    public Class<?> cls;

    public CommonMethods() throws ClassNotFoundException {
        cls = Class.forName("reflection.Person");
    }

    public static void main(String[] args) throws Exception {
        new CommonMethods().ConstructorMethods();
    }

    @Test
    public void ClassMethods() {
        //全类名
        String name = cls.getName();
        System.out.println(name);
        //类名
        String simpleName = cls.getSimpleName();
        //所有public属性，包括本类和父类
        Field[] fields = cls.getFields();
        //所有属性，只含本类
        Field[] declaredFields = cls.getDeclaredFields();
        //所有public方法，包括本类和父类
        Method[] methods = cls.getMethods();
        //所有方法，只含本类
        Method[] declaredMethods = cls.getDeclaredMethods();
        //所有public构造器，只含本类
        Constructor<?>[] constructors = cls.getConstructors();
        //所有构造器，只含本类
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        //包名
        Package aPackage = cls.getPackage();
        //父类
        Class<?> superclass = cls.getSuperclass();
        //所有接口
        Class<?>[] interfaces = cls.getInterfaces();
        //所有注解
        Annotation[] annotations = cls.getAnnotations();
    }

    @Test
    public void FieldMethods() throws Exception {
        //获取私有属性
        Field age = cls.getDeclaredField("age");
        //以数字形式返回修饰符
        //public = 1，private = 2,protected = 4,static = 8,final = 16
        //返回结果为修饰符对应的值相加
        int modifiers = age.getModifiers();
        //以Class对象形式返回数据类型
        Class<?> type = age.getType();
        //属性名
        String name = age.getName();
    }

    @Test
    public void MethodMethods() throws Exception {
        Method hi = cls.getMethod("hi");
        //返回修饰符，规则同Field
        int modifiers = hi.getModifiers();
        //返回值类型
        Class<?> returnType = hi.getReturnType();
        //方法名
        String name = hi.getName();
        //返回参数类型数组
        Class<?>[] parameterTypes = hi.getParameterTypes();
        //调用方法
        Object o = cls.getDeclaredConstructor().newInstance();
        hi.invoke(o);
    }

    @Test
    public void ConstructorMethods() throws NoSuchMethodException {
        Constructor<?> constructor = cls.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //返回修饰符，规则同Field
        int modifiers = constructor.getModifiers();
        //方法名
        String name = constructor.getName();
        //返回参数类型数组
        Class<?>[] parameterTypes = constructor.getParameterTypes();
    }
}
