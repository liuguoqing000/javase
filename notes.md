[toc]

# 基础

## 命名规范

- **项目**：全小写，中划线分割。spring-cloud
- **包**：全小写，无下划线。com.hsp.abc
- **类 & 接口**：大驼峰。TankShotGame
- **变量 & 方法**：小驼峰。stuName
- **常量**：全大写，下划线分割，用final static修饰。TAX_RATE

## 安装JDK配置环境变量

- PATH环境变量(必需)： java 文件通过 PATH 中设定的 JDK 目录找到编译命令进行编译
- CLASSPATH环境变量(必需)：指定类搜索路径，JVM通过CLASSPTH来寻找类
- JAVA_HOME环境变量(非必需)：即 JDK 安装的路径，idea等通过 JAVA_HOME 找到 JDK

## JDK/JRE/JVM

![JVMJREJDK](https://liuguoqing001.oss-cn-hangzhou.aliyuncs.com/img/JVMJREJDK.png)

## IDEA目录

| 目录     | 意义                                                         |
| -------- | ------------------------------------------------------------ |
| .idea    | 存放项目的配置信息包括数据源，类库，项目字符编码，历史记录，版本控制信息等 |
| src      | 存放.java文件                                                |
| out      | 存放.class文件; .java文件编译生成.class文件                  |
| demo.iml | ①项目标识文件，缺少它就无法识别项目，与Eclipse的.project文件相同                                                                                ②是IDEA自己创建的模块文件，存储依赖/模块相关信息，比如Java组建/插件组建/Maven组建等                                                                ③在不同的设备上其也有差异，所以在管理项目的时候，.project和.iml文件都需要忽略掉 |

## 数据类型

```mermaid
graph LR
	数据类型 --> 基本数据类型
	数据类型 --> 引用数据类型
	基本数据类型 --> 数值型
	数值型 --> 整数类型:byte,short,int,long
	数值型 --> 浮点类型:float,double
	基本数据类型 --> 字符型:char
	基本数据类型 --> 布尔型:boolean
    引用数据类型 --> 类:Class
    引用数据类型 --> 接口:interface
    引用数据类型 --> 数组:array
```

## 键盘输入

```java
Scanner sc = new Scanner(System.in);
String str = sc.next();
char ch = sc.next().charAt(0);
int a = myScanner.nextInt();
```

## 数据类型转换

```java
//基本类型 -> String类型
int a = 100;
String str = a + "";
//String类型->基本类型
int a = Integer.parseInt(str);
float b = Float.parseFloat(str);
boolean c = Boolean.parseBoolean(str);
char d = str.charAt(0);
```

## 可变参数

- 可变参数本质是数组

  ```java
  public void test(int... nums) { System.out.println(nums.length); }
  ```

- 形参列表中：可变参数必须垫底，且最多只有1个可变参数

## 全局变量 & 局部变量

- 全局变量：属性，有初始值
- 局部变量：一般指方法中的变量，需初始化
- 两者可同名，访问时采用就近原则

# OOP

## 继承

- 父类又叫超类，基类；子类又叫派生类
- 子类继承父类的成员
- 当访问父类和子类的同名属性时，优先访问子类 -> 未找到则访问父类 -> 若父类为private则报错

## 访问修饰符

| 修饰符    | 子类 | 同包 | 不同包 |
| --------- | ---- | ---- | ------ |
| 默认      | ❌    | ✔    | ❌      |
| protected | ✔    | ✔    | ❌      |

## 构造器

<kbd>alt</kbd> + <kbd>G</kbd>

- 默认构造器为`Person(){}`
- 规则
  - 修饰符可有可无
  - 无返回类型
  - 方法名同类名
- 一旦定义了自己的构造器，将覆盖默认构造器（注意：不是重载！），除非显式地定义下

> **构造器调用细节**
>
> 1. 创建子类对象时肯定会调用构造父类的构造器，完成父类的初始化
>
> 2. 创建子类时，无论调用子类的which构造器，默认情况下必定会调用父类的无参构造器；
     >
     >    但如果父类的无参构造器没了（比如自己定义的构造器把默认的无参构造器覆盖了），则必须在子类的每个构造器中用super()
     去指定使用父类的which构造器完成父类的初始化，否则编译报错。验证了第1条规则。

## instanceof

- 判断对象的运行类型是否为XX类型或XX类型的子类型

## this

- this.data & this.func() ：调用本类中的属性和方法；若本类没有，则向上查找
- this(指定的本类其他构造器的参数列表)：调用本类其他构造器方法，且只能写在构造器中第一行

## super

- super.data & super.func() ：访问父类成员
- super(指定的父类构造器的参数列表)：访问父类的指定构造器，且只能写在构造器中第一行。因此super()与this()冲突

- 当父和子成员重名时，只能通过super访问父类属性和方法

## 重载

- 方法名相同
- 形参类型 | 个数 | 顺序 至少一样不同
- 访问修饰符 & 形参名 & 返回类型 无所谓

## 重写

- 方法名相同
- 参数列表相同
- 返回类型相同 或者 子类的返回类型是父类的返回类型的子类
- 访问修饰符相同 或 扩大

## 多态

- **编译类型 & 运行类型**

  - 左边 = 编译类型；右边 = 运行类型
  - 编译类型在指定引用对象时便已确定，不可变；运行类型可变

  ```java
  Animal animal = new Cat();
  //运行类型可变
  animal = new Dog();
  ```

- **向上转型**

  - 属性
    - 父和子都有：优先调用父类（[java的动态绑定机制 ](# java的动态绑定机制 )）
    - 子独有：不可调用⭐

  - 方法
    - 父和子都有：优先调用子类（[java的动态绑定机制 ](# java的动态绑定机制 )）
    - 子独有：不可调用⭐

  ```java
  // 向上转型:父类的引用指向子类的对象
  // 父类类型引用 = new 子类类型()
  Animal animal = new Cat();
  // 下面是错误示范
  animal.catchMouse();
  ```

- **向下转型**

  - 只能强转父类的引用，不能强转父类的对象

    ```java
    // 可强转：父类的引用为Cat对象
    Animal animal = new Cat();
    // 不可强转：父类的引用为自己的对象
    Animal animal = new Animal();
    ```

  - 向上转型后才能向下转型后

    ```java
    // 可转为Cat，但不可转为Dog
    Cat cat = (Cat) animal;
    // 由于向上转型后才能向下转型,因此,
    Animal animal = new Cat();
    Cat cat = (Cat) animal;
    // 等价于
    Cat cat = new cat();
    ```


- 多态数组：数组定义类型为父类类型，里面保存的实际类型为子类类型
- 多态参数：方法定义的形参类型为父类类型，实参类型允许为子类类型

## 动态绑定机制

- **前提是可以调用，不可调用见[向上转型](# 多态)**
- **调用**对象方法时：该方法会和该对象的内存地址/运行类型绑定
- **调用**对象属性时：无动态绑定机制，方法在哪一类声明，则调用哪一类的属性（可以理解为看编译类型❔）

## Object类

#### 所有类的根基类

- 当一个类未指定父类时，默认其父类为Object
- Object类中的方法（会用到的有）
  - equals() / toString() / getClass()/ hashCode()/ clone()/ finalize()/ wait()/ notify()/ notifyAll()等

#### hasnCode()

- 提高具有哈希结构的容器的效率
- 两个引用若指向的是同一对象，则哈希值也一样；不同对象则哈希值不一样

#### toString()

- 原型

  ```java
  public String toString() {
      return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
  // getClass().getName()：返回全类名，即包名+类名
  // toHexString():将长整型转换为十六进制字符串
  // hashCode():返回哈希编码
  ```

- 当输出一个对象时，会自动调用toString

#### equals与==区别

- ==
  - 基本数据类型：判断值相等（不要求类型严格相同）
  - 引用数据类型：只有指向同一个对象时才返回true（不可用于无父子关系的对象间的比较）
- equals()
  - 只能用于引用数据类型，与 == 的作用相同
  - 一般重写为“比较两个对象的实体内容是否相同”，如**String类**

[equals和==区别](# equals和==区别)

## static

**类变量 & 静态变量**

- 否则称为实例变量 / 普通变量 / 非静态变量
- 该类的所有实例对象共享该变量
- 在类加载时便已生成，且该变量可直接通过类调用

```java
public static int count = 0;
System.out.println(DEMO.count);
```

**静态方法 & 类方法**

- 静态方法不能使用与对象有关的关键字如this和super;
- 静态方法只能访问静态属性或静态方法;
- 普通方法既可访问普通方法又可访问静态方法;
- 总的来说就是创建时间的先后产生的问题。
- 当方法中不涉及任何与对象相关的成员时，常设计为静态方法;
- 或希望不用创建实例即可调用方法时，也涉及为静态方法，如Math类、工具类或一些常用的方法。

```java
public static void test() {}
System.out.println(DEMO.test());
```

## psvm

**public static void main(String[] args)**

- 参数说明：

  - main方法由jvm调用

  - public：dddd

  - static：jvm在调用main方法时无需创建对象

  - String[] args：从控制台接收的参数

- main方法可访问静态成员；不可访问非静态成员

## 类加载

类什么时候被加载？

1.创建对象实例时

2.调用static的属性或方法时

3.子类被加载时，父类也会被加载

注：每次运行时，不管有多少语句符合上述规则，每个类只会被加载一次

## 代码块

- 又称初始化块，属于类中的成员，但只有方法体和修饰符(修饰符要么不写要么写static)。

  根据是否写static划分为静态代码块/普通代码块；

  静态代码块只随着类的加载**执行1次**；而非静态代码块每创建一个对象便执行1次

  ```java
  // 静态代码块只执行1次；非静态代码块执行2次
  Cat cat1 = new Cat();
  Cat cat2 = new Cat();
  ```

- 创建一个对象时，一个类中成员的调用顺序为：

  1. static代码块和static属性初始化（两者优先级相同，当有不止一个时，按定义的顺续调用）
  2. 普通代码块和普通属性的初始化（同上）
  3. 构造器

- 创建一个子类对象时，调用顺序为：

  - 现有 静态代码块、静态属性初始化、普通代码块、普通属性初始化、构造器

  - 一.父类加载

    1. 父类的静态代码块 & 静态属性初始化

  - 二.子类加载

    2. 子类的静态代码块 & 静态属性初始化

  - 三.父类对象加载

    3. 父类的普通代码块 & 普通属性初始化

    4. 父类的构造器（理解：父类对象加载是子类对象加载的准备工作）

  - 四.子类对象加载

    5. 子类的普通代码块 & 普通属性初始化

    6. 子类的构造器

- 静态代码块只可访问静态成员；普通方法即可访问静态成员也可访问普通成员

## 单例模式

1. 构造器私有化
2. 在类内部创建静态对象
3. 向外暴露一个静态的访问方法，如 `getInstance`

**饿汉式**：

+ 可以不用，但不能没有，即类加载时便创建实例
+ 存在资源浪费问题

```java
class Cat {
    private String name;
    private static Cat cat = new Cat("tom");

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getCat() {
        return cat;
}
```

**懒汉式**：

+ 用的时候再有，即使用时再创建实例
+ 存在线程安全问题

```java
class Cat {
	private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("Tom");
        }
        return cat;
    }
}
```

## final

- 用于当不希望 类被继承 / 方法被子类重写或覆盖(与重载没关系) / 属性被修改 / 局部变量被修改 / 形参被修改 时

- 一般用来修饰常量，如TAX_RATE

  - 而修饰常量时，常常和static连用，可以保证这个类的每个实例访问的是同一份常量；

    且内存不用重复申请和释放空间，提高效率

- 必须初始化，可在 定义时 / 构造器 / 代码块 中赋值

  - 但如果既是static又是final，则不能在构造器中赋值

- String,Interger等包装类均为final类

## abstract类

+ **含抽象方法的类即为抽象类**；抽象类中也**可有正常类**
+ **抽象方法无方法体，交由子类实现**
+ 不可被实例化
+ 当B继承抽象类A时，B必须**实现A的所有抽象方法**。除非B也是抽象类
+ 方法定义时，`abstract` 与 `private`、`final`、`static`相悖不共存

## interface

**<kbd>alt</kbd> + <kbd>enter</kbd>    实现接口中的方法**

+ 默认均为抽象方法，实现它的子类需**实现接口的所有抽象方法**

+ 接口中的方法有3种：默认、`default`、`static`

  ```java
  public void m1();
  public default void m2(){}
  public static void m3(){}
  ```

+ 不可被实例化

+ 接口中的方法访问修饰符**均为`public`，默认为`abstract`**

  ```java
  interface I1 {
      void m1();
      void m2();
  }
  ```

+ 一个类可实现多个接口
+ 接口中所有属性均为 **`public static final `**
+ 接口可以继承接口，注意是继承而是实现

## 继承类 VS 实现接口

> 如小猴生来便会猴子爬树，这是继承；但如果想像鸟一样飞，鱼一样游就需要自己去学习，这就是实现

+ is a 和 has a

## 接口多态

+ [多态数组](src/interface_/PolyArray.java)

+ 多态传递

## 内部类

### 身份为局部变量

**局部内部类(有类名)**

+ 外部类与局部内部类中成员同名时，访问采取就近原则

  若要访问外部类的同名成员可使用 `外部类名.this.成员名`

**匿名内部类(无类名)**

+ ...... `外部类名.this.成员名`
+ [代码：基于接口的匿名内部类写法、基于类的匿名内部类写法、基于抽象类的匿名内部类写法（略写）、匿名内部类作为参数的使用](src/inner_class/AnonymousInnerClass.java)

### 身份为类成员

**成员内部类(无static修饰)**

+ ...... `外部类名.this.成员名`

**静态内部类(有static修饰)**

+ 只可访问外部类的静态成员
+ ...... `外部类名.成员名`(因为是静态类，this是对象实例的意思)
+ [代码：外部其他类访问成员内部类和静态内部类的两种方式](src/inner_class/StaticInnerClass.java)

# 枚举和注解

## [enum使用](src/enum_/EnumUse.java)

+ 使用enum关键字时将默认继承`enum`类，因此不可再继承其他类

## [enum常用方法](src/enum_/EnumMethod.java)

## @Override

+ 只可用于方法

+ 是否写该注解区别在于编译器是否会检查你是否正确重写了方法

## @Deprecated

+ 表示已过时，但仍可使用
+ 可修饰 方法、类、包、参数、字段

## @SuppressWarnings

+ 用来抑制警告
+ 作用范围与放置的位置相关

```java
// 忽略所有警告
@SuppressWarnings({"all"})
```

# Exception

<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>T</kbd>  + <kbd>6</kbd>

## 异常体系图

+ 编译异常须手动抛出
+ 运行时异常默认为throws

```mermaid
graph LR
    Throwable --> Error
    Throwable --> Exception
    Error --> StackOverFlow
    Error --> OutOfMemory
    Exception --> 编译异常
    编译异常 --> FileNotFoundException等
    Exception --> 运行时异常
    运行时异常 --> 数组越界异常
    运行时异常 --> 空指针异常
    运行时异常 --> 算数异常
    运行时异常 --> 类转换异常
    运行时异常 --> 数字格式异常
```

## 异常处理机制

+ **try-catch-finally**

  ```java
  /* 一般用法 */
  try {
      // 一旦异常跳过剩下的try块语句而进入catch块
  } catch(Execption e) {
      // 没有异常不执行catch块
      // 捕获异常后封装到e中，程序员自定义如何处理异常
      // 如：System.out.println(e.getMessage());
  } finally {
      // 无论是否有异常，均执行
      // 可不写
  }
  
  /* 多个catch */
  // 要求子类异常写在父类异常之前
  try {
  
  } catch (NullPointerException e) {
  
  } catch (ArithmeticException e) {
  
  } catch (Exception e) {
  
  }
  
  /* try-finally */
  ```

+ **throws**

  ```java
  // 将异常抛给调用者，由调用者决定是catch还是继续抛出
  // 当抛出到JVM时，JVM输出异常信息并退出程序
  public class demo {
      public static void main(String[] args) throws Exception{
      	 // 没有catch块默认为throws Exception
      }
  }
  ```

+ 典例：判断用户是否输入的是整数

  ```java
  while (true) {
      System.out.print("请输入整数：");
      try {
          str = sc.next();
          System.out.println("你输入的数是："+Integer.parseInt(str));
          break;
      } catch (Exception e) {
          System.out.print("你输入的不是整数！");
      }
  }
  ```

## 自定义异常(通过throw)

+ 一般继承运行时异常，编译异常太麻烦

```java
/* main() */
if ( age > 200) {throw new ageException("年龄不合理！");}
System.out.println("河里");
/* class */
class ageException extends RuntimeException {
    public ageException(String message) { super(message); }
}
```

## throw & throws

|        | 意义                         | 位置       | 后面跟的关键字                                       |      |
| ------ | ---------------------------- | ---------- | ---------------------------------------------------- | ---- |
| throws | 异常处理的一种方式           | 方法声明处 | 异常类型，如throws Exception                         |      |
| throw  | 用于手动生成异常对象的关键字 | 方法体内   | 异常对象，如throw new RuntimeException("参数不正确") |      |

# 常用类

## 包装类

+ 八大包装类为：Byte Short Integer Long Float Double Character Boolean

+ 装箱：基本数据类型 -> 包装类；反之为拆箱

  ```java
  /*jdk5前，为手动拆箱和装箱*/
  int i = 10;
  // 装箱方式一
  Integer integer = new Integer(i);
  // 装箱方式二
  Integer integer = Integer.valueof(i);
  // 拆箱
  int j = integer.intValue();
  
  /*jdk5后，为自动拆箱和装箱*/
  // 自动装箱
  Integer integer = i;
  // 自动拆箱
  int k = integer;
  ```

+ [包装类 <-> String类：Integer <-> String](src/CommonClass/IntToString.java)

+ [常用方法](src/CommonClass/CommonWrapperMethods.java)

## String & StringBuffer & StringBuilder

+ equals 与 == 的区别

+ String str = "abc"  与 String str = new String("abc")  的区别

  ```java
  String s1 = "aaa";
  String s2 = "bbb" + s1;
  // s2的内存布局与new String("aaabbb")一样，而非普通的String
  ```

  > [练习P467 -P470](https://www.bilibili.com/video/BV1fh411y7R8/?p=468&spm_id_from=pageDriver&vd_source=31a2c1c1b88c213ffcdc490b3eed651c)

+ [String常用方法](src/CommonClass/StringMethods.java)

  [StringBuffer常用方法](src/CommonClass/StringBufferMethods.java)

+ 三者的区别

  ![String StringBuilder StringBuffer区别](https://liuguoqing001.oss-cn-hangzhou.aliyuncs.com/img/String%20StringBuilder%20StringBuffer%E5%8C%BA%E5%88%AB.png)

## Math

+ [常用方法](src/CommonClass/MathMethod.java)

+ 随机数

  ```java
  int min = 31;
  int max = 37;
  int num = (int)(min + Math.random() * (max - min + 1));
  ```

## Arrays

+ [常用方法1](src/CommonClass/ArraysMethod01.java)

+ [常用方法2](src/CommonClass/ArraysMethod02.java)

## System

```java
long start = System.currentTimeMillis();
/* 执行的程序 */
long end = System.currentTimeMillis();
System.out.println("执行时间为：" + (end - start));
```

## BigInteger & BigDecimal

+ [BigInteger使用](src/CommonClass/BigInteger_.java)
+ [BigDecimal使用](src/CommonClass/BigDecimal_.java)

## Date & Calendar & LocalDateTime

推荐使用LocalDateTime，[用法](src/CommonClass/Date.java)

```java
/* 如何获取当前日期 */
//1.Date类
Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        System.out.println(sdf.format(date));
//2.LocalDateTime类
        LocalDateTime ldt=LocalDateTime.now(); //LocalDate.now();//LocalTime.now()
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(ldt));
```

# 集合

```mermaid
graph TB
	Collection接口 --> List接口
	Collection接口 --> Set接口
	List接口 --> ArrayList类
	List接口 --> LinkedList类
	List接口 --> Vector类
	Set接口 --> HashSet类
	Set接口 --> LinkedHashSet类类
	Set接口 --> TreeSet类
	Map接口 --> HashMap类
	HashMap类 --> LinkedHashMap类
    Map接口 --> HashTable类
    HashTable类 --> Properties类
    Map接口 --> TreeMap类
```

+ 集合分为 单列集合 & 双列集合
  + Collection接口的子接口List和Set为单列集合
  + Map接口的实现子类为双列集合，存放K-V

## Collection

+ [常用方法及遍历方式](src/Collection_/CollectionMethods.java)

  ```java
  List list = new ArrayList();
  list.add(new Book("wa","b",5));
  list.add("dsa");
  // 1.iterator迭代器遍历
  // 快捷键：itit
  Iterator iterator = list.iterator();
  while (iterator.hasNext()) {
      Object next = iterator.next();
      System.out.println(next);
  }
  // 2.for增强遍历
  // 快捷键：list.for或I或list.iter
  for(Object book:list){
      System.out.println(book);
  }
  // 3.普通for
  for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
  }
  ```

## List

+ 可重复 / 有序(添加顺序与取出顺序一致)
+ 常用方法与Collection一致

**ArrayList**

+ ArrayList基本等同于Vector
+ 但线程不安全

**Vector**

+ 线程安全

## Set

+ 无序：添加和去除的顺序不一致 / 无索引 / 不允许重复元素 / 最多包含一个null
+ 常用方法与Collection一致

**HashSet**

+ 本质上是HashMap / 只能存放一个null / 不重复 / 无序
+ 底层为hashmap，只不过value为常量，机制：
    + 先获取要添加的的元素的hashCode()值
    + 对哈希表进行运算，得到的索引值即为要存在哈希表中的位置号
    + 如果该位置为空，直接存放；不为空则进行equals判断
        + 相等则不再添加
        + 不等则以链表的方式添加
+ [练习](src/Collection_/HashSetExercise.java)

**TreeSet**

+ 底层为TreeMap
+ [排序实例](src/Collection_/TreeSetMethods.java)

## Map

+ key不重复且最多只有一个null，value可重复且null的数量无限制

+ 无序

+ 常用String类作为key

+ 通过put添加，而非add

  ```java
  // 当重复添加时，value会被替换掉，而不是加不进去
  map.put("no1","aaa");
  map.put("no1","bbb");
  ```

+ [常用方法及遍历方式](src/Collection_/MapMethods.java)

+ 一个Map.Entry就是一个node。node包含一个键值对。entrySet包含所有的node，但并不是说entrySet的一个元素就是一个node，需要把该元素转换一下才是一个Map.Entry即node

**HashMap**

+ **使用频率最高**
+ 线程不安全

**HashTable**

+ 键和值都不能为null
+ 线程安全

**Properties**

+ HashTable子类，使用特点与HashTable类似
+ 可用于读取xxx.properties配置文件

**TreeMap**

+ TreeSet父类，使用与之类似
+ [排序示例](src/Collection_/TreeMapMethods.java)

## 集合选型

+ 单列：Collection接口
    + 允许重复：List
        + 增删多：LinkedList
        + 改查多：ArrayList
    + 不允许重复：Set
        + 无序：HashSet
        + 排序：TreeSet
        + 插入和取出顺序一致：LinkedHashSet
+ 双列：Map接口
  + 键无序：HashMap
  + 键排序：TreeMap
  + 见插入顺序和取出顺序一致：LinkedHashMap
  + 读取文件：Properties

## Collections工具类

+ [常用方法](src/Collection_/Collections_.java)

+ [集合练习题](src/Collection_/exercise)

# 泛型

# Thread

Thread类实现了Runnable

## 创建线程

+ **继承Thread**

  ```JAVA
  /* main() */
  Cat c1 = new Cat();
  c1.start();
  /* class */
  class Cat extends Thread {
      public void run() { /*业务逻辑*/}
  }
  ```

+ **实现Runnable**

  ```java
  /* main() */
  Cat cat = new Cat();
  Thread t1 = new Thread(cat);
  t1.start();
  /* class */
  class Cat implements Runnable {
      public void run() { /*业务逻辑*/ }
  }
  ```

+ 两种方式的异同

  + 同：start开启线程 -> start调用start0 -> start0由JVM执行（创建线程进入就绪态）

  + 异：实现Runnable更适合多个线程共享一个资源的情况

## 通知线程退出

```java
/* main() */
c1.setLoop(false);
/* class */
class cat implements Runnable{
	private boolean loop = true;
    public void setLoop(boolean loop) {this.loop = loop;}
    public void run() {while (loop)}    
}
```

## 线程常用方法

setName / setPriority / getPriority / sleep / start / run / interrupt

```java
/* main() */
c1.interrupt(); // 自己叫醒自己
/* run() */
try {
    System.out.println("开始休眠");
    Thread.sleep(1000);
} catch (InterruptedException e) {/*注意是InterruptedException*/
    System.out.println("打断");	// 睡眠时被打断则抛出异常
}
```

getName

```java
Thread.currentThread().getName();
```

yield / join

```java
/* main() */
Thread t1 = new Thread(new Cat());
t1.start();	// 启动c1并优先执行c1再执行主线程
t1.join();
```

## 守护线程

+ 用户线程：也叫工作线程
+ 守护线程：服务于用户线程，当所有用户线程结束时才结束。如垃圾回收机制。

```java
/* main() */
Thread t1 = new Thread(new Cat());
t1.setDaemon(true);
t1.start();
```

## 线程状态

![图片](https://liuguoqing001.oss-cn-hangzhou.aliyuncs.com/img/%E5%9B%BE%E7%89%87.png)

```java
Thread t1 = new Thread(new Cat());
if(Thread.State.TERMINATED != t1.getState()){}
```

## 线程同步（超卖问题）

+ **synchronized**

+ 疑惑分析

  1. 锁加到run方法：1号窗口直接把票卖完

  1. 锁加到run方法，run调用sell，原先run中的代码全部移到sell：1号窗口直接把票卖完

  1. 锁加到sell方法，run调用sell，原先run中的代码全部移到sell：1号窗口直接把票卖完

  1. 锁加到sell方法，run调用sell，循环中的代码移到sell：正常

     如何理解：while循环就相当于工作，进入while循环才相当于开始营业，所以当while也被锁起来时，只有一个窗口在工作

     所以，锁必须不能加到while上！！！

     所以，只把访问了临界资源的代码锁起来，其它尽量不锁！！！

## 互斥锁（synchronized）

可同步方法 或 同步代码块。优先选择同步代码块。

```java
// 1.非静态方法加锁
// 相当于给此类的所有对象加锁
// 此时，代码块锁对象为 this
class Cat implements Runnable {
  public synchronized void m1() {
  }

  public void m2() {
    synchronized (this) { /*临界区*/ }
  }
}

// 2.静态方法加锁
// 相当于给此类加锁
// 此时，代码块锁对象为 当前类.class
class Cat implements Runnable {
  public synchronized static void m() {
  }

  public void m2() {
    synchronized (Cat.class) { /*临界区*/ }
  }
}

// 要求加锁的对象必为同一个！如下为错误示范
class Cat extends Thread {
  public void m() {
    synchronized (this) { /*临界区*/ }
  }
} 
```

## 释放锁

+ 代码块执行完毕。正常拉完
+ return或break。拉到一半经理叫改bug
+ error或exception。拉到一半发现没带纸
+ wait。拉到一半发现没感觉，需要酝酿一下

下面不会释放锁

+ sleep 或 yield

# IO流

## 文件

+ [创建文件](src\file\FileCreate.java)

+ 常用方法

  ```java
  getName();
  getAbsolutePath();
  getParent();
  getlength();	// 单位为字节
  exists();	// 返回布尔值
  isFile();	
  isDirectory();
  mkdir();	// 创建一级目录，返回布尔值
  mkdirs();	// 创建多级目录，返回布尔值
  delete();	// 删除空目录或文件，返回布尔值
  ```

## IO流类图

![图片](https://liuguoqing001.oss-cn-hangzhou.aliyuncs.com/img/%E5%9B%BE%E7%89%87-16849167184561.png)

## FileInputStream & FileOutputStream

+ [FileInputStream](src\IOStream\FileInputStream_.java)
+ [FileOutputStream](src\IOStream\FileOutputStream_.java)

## FileReader & FileWriter

+ [FileReader](src\IOStream\FileReader_.java)
+ [FileWriter](src\IOStream\FileWriter_.java)

+ FileWriter使用后必须要close或flush，否则写入失败

## 节点流 / 包装流

+ 节点流：从特定数据源读写数据，如FileReader、FilrWriter
+ 包装流：又称处理流，包装了各种节点流，如BufferedWriter、BufferedReader
+ 序列化：在保存数据时，既保存数值又保存数据类型
+ 反序列化：在恢复数据时，既恢复数值又恢复数据类型
+ 纯文本数据字符流效率更高，且可以有效解决中文乱码问题；
+ 二进制文件使用字节流

## BufferedReader & BufferedWriter ***

+ [BufferedReader](src/IOStream/BufferedReader_.java)
+ [BufferedWriter](src/IOStream/BufferedWriter_.java)

## BufferedInputStream & BufferedOutputStream

## ObjectInputStream & ObjectOutputStream

+ [ObjectInputStream使用实例](src/IOStream/ObjectInputStream_.java)
+ [ObjectOutputStream使用实例](src/IOStream/ObjectOutputStream_.java)
+ [细节](src/IOStream/Dog.java)

## InputStreamReader & OutputStreamWriter

+ 可用来解决字符乱码问题
+ [BufferedReader使用实例](src/IOStream/BufferedReader_.java)

## PrintStream

+ 字节流

+ [使用](src/IOStream/PrintStream_.java)

## PrintWriter

+ 字符流
+ [使用](src/IOStream/PrintWriter_.java)

## System.in & System.out

|            | 编译类型    | 运行类型            | 数据源 |
| ---------- | ----------- | ------------------- | ------ |
| System.in  | InputStream | BufferedInputStream | 键盘   |
| System.out | PrintStream | PrintStream         | 显示器 |

## Properties

+ [使用](src/IOStream/Properties_.java)

# 反射

# JAVA8

# MySQL



































