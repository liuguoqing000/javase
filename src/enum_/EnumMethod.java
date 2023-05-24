package enum_;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc 演示枚举常用方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;
        // 常量名
        System.out.println("常量名" + autumn.name());
        // 编号
        System.out.println("编号" + autumn.ordinal());
        // values()方法返回一个数组
        Season1[] seasonArray = autumn.values();
        for (Season1 s : seasonArray) {
            System.out.println(s);
        }
        // valueof():将字符串当作常量名转换为枚举对象，前提是有
        Season1 s = Season1.valueOf("AUTUMN");
        System.out.println(s);
        // 比较两个常量的位置号。相等返回0，不等返回位置号的差
        System.out.println(Season1.AUTUMN.compareTo(Season1.AUTUMN));
    }
}

enum Season1 {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");

    private String name;
    private String desc;

    private Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
