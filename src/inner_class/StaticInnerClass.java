package inner_class;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc 外部其他类访问成员内部类和静态内部类的两种方式
 */

public class StaticInnerClass {
    public static void main(String[] args) {
        // 访问成员内部类1.
        P.Student student1 = new P().new Student();
        // 访问成员内部类2.
        P.Student student2 = new P().getStudentInstance();
        // 访问静态内部类1.
        P.Teacher teacher = new P.Teacher();
        // 访问静态内部类2.
        P.Teacher teacherInstance = P.getTeacherInstance();
    }
}

class P {
    public class Student {

    }

    public static class Teacher {

    }

    public Student getStudentInstance() {
        return new Student();
    }

    // 注意此处static
    public static Teacher getTeacherInstance() {
        return new Teacher();
    }
}
