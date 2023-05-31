package Generic.exercise;

import org.junit.Test;

import java.util.*;

/**
 * @author liuguoqing000
 * @date 2023/5/31 19:58
 * @desc
 */
public class Exercise02 {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        DAO<User> userDAO = new DAO<>();
        //save
        userDAO.save("no1", new User(1, 1, "john"));
        userDAO.save("no2", new User(1, 1, "amy"));
        userDAO.save("no3", new User(1, 1, "tom"));
        //get
        System.out.println(userDAO.get("no1"));
        //update
        userDAO.update("no1", new User(1, 1, "jjjj"));
        //list
        System.out.println(userDAO.list());
        //delete
        userDAO.delete("no3");
        System.out.println(userDAO.list());
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    @Test
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public void delete(String id) {
        map.remove(id);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            list.add(map.get(s));
        }
        return list;
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
