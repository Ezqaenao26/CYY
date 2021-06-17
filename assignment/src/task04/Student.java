package task04;

public class Student {
    private String name;
    private int stuid;
    void setName(String name1){
        name=name1;
    }
    String getName(){
        return name;
    }
    void setStuid(int id){
        if(id<=0){
            System.out.println("...");
        }else if(id>=42){
            System.out.println("...");
        }else {
            stuid=id;
        }
    }
    int getStuid(){
        return stuid;
    }

    void like(){
        System.out.println(name+"喜欢读书");
    }
    void sc(){
        System.out.println(name+"啥都会，都很厉害");
    }
}