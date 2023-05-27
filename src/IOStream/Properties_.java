package IOStream;

import java.io.*;
import java.util.Properties;

/**
 * @author 刘国庆
 * @date 2023/5/27
 * @desc 使用Properties读取、创建、修改配置文件内容
 */
public class Properties_ {
    public static void main(String[] args) throws IOException {
        /* 读取配置文件内容 */
        // 1.创建对象
        Properties properties = new Properties();
        // 2.加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        // 3.将键值对显示到控制台
        properties.list(System.out);
        // 4.根据key获得value
        String value = properties.getProperty("pwd");
        System.out.println("密码:" + value);

        /* 创建配置文件 */
        // 1.创建对象
        Properties properties1 = new Properties();
        // 2.创建配置文件
        properties1.setProperty("charset", "utf-8");
        properties1.setProperty("name", "汤姆");
        properties1.setProperty("pwd", "abc123");
        // 3.存储  包装的流为字符号流时配置文件中显示为中文
        properties1.store(new FileOutputStream("src\\mysql2.properties"), null);//null参数表示无注解
        System.out.println("success！");

        /* 修改配置文件 */
        // setProperty若有key，则为修改
        // setProperty若无key，则为添加

    }
}
