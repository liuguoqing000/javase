package new_features;

import org.junit.Test;

import java.util.Optional;

/**
 * @author liuguoqing000
 * @date 2023/7/4 20:24
 * @desc optional容器
 */
public class optional {
    @Test
    public void m1() {
        String star = "lucifer";
        star = null;
        // ofNullable用来创建一个optional实例保存star，star可能为空
        Optional<String> o = Optional.ofNullable(star);
        String otherStar = "morningstar";
        // 若optional实例中的star为null，则返回otherStar；否则返回值仍为star
        String finalStar = o.orElse(otherStar);
        System.out.println(finalStar);
        // 取出optional实例中保存的值
        System.out.println(o.get());
    }


    /* 2. */
    @Test
    public void m2() {

    }


    /* 3. */
    @Test
    public void m3() {

    }


    /* 4. */
    @Test
    public void m4() {

    }
}
