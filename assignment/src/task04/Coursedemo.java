package task04;

public class Coursedemo {
    public static void main(String[] args) {
        Course c1=new Course();
        Course c2=new Course();
        c1.setName("java");
        c2.setName("mysql");
        String name1=c1.getName();
        String name2=c2.getName();
        c1.setStuid(4);
        c2.setStuid(5);
        int id1=c1.getClassid();
        int id2=c2.getClassid();
        System.out.println("课程"+name1);
        System.out.println("课程"+name2);
        c1.older(id1,id2);
    }
}