/**
 * @author sqh
 * 类是由属性和方法组成
 */
public class Person {
    private String name;
    private int age;
    void setName(String name1){
        name=name1;
    }
    String getName(){
        return name;
    }
    void setAge(int age1){
        if(age1<0){
            System.out.println("年龄有误，不能为负数");
        }else if(age1>150){
            System.out.println("年龄没有超过150的，请重新设置");
        }else{
            age=age1;
        }
    }


    void eat(){
        System.out.println(name+"会吃饭");
    }
    void speak(){
        System.out.println(name+"会讲话");
    }

    public void habby() {
        System.out.println(name+"热爱打代码");
    }
}
