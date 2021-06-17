/**
 * @author sqh
 * 测试类：创建person对象，调用对象
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(25);
        p1.setName("sqh");
        p1.eat();
        p1.speak();
        p1.habby();
    }
}

