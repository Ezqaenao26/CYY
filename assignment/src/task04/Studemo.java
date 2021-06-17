package task04;

public class Studemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("yzj");
        String name=s1.getName();
        System.out.println("学生姓名："+name);
        s1.setStuid(29);
        int stuid=s1.getStuid();
        System.out.println("学号："+stuid);
        s1.like();
        s1.sc();
    }
}
