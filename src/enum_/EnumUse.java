package enum_;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc enum基本用法
 */
public class EnumUse {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
        // 若未主动重写toString，将调用enum中重写的toString方法打印常量名
    }
}

enum Season {
    // 1.相当于 public final static Season SPRING = new Season("春天", "温暖");
    // 2.枚举对象必须放在最前面
    // 3.多个枚举对象 ，相隔 ； 结尾
    // 4.无参数时只写名字亦可
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"),
    NO_PARAMETER();

    private String name;
    private String desc;

    // private修饰词防止在外部创建对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    private Season() {
    }

    // 去除setter，防止常量值被修改
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
