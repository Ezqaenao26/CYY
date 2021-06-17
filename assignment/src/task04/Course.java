package task04;

public class Course {
    private String name;
    private int classid;
    void setName(String name1){
        name=name1;
    }
    String getName(){
        return name;
    }
    void setStuid(int id){
        if(id<=0){
            System.out.println("没有这个学号");
        }else if(id>=35){
            System.out.println("没有这个学号");
        }else {
            classid=id;
        }
    }
    int getClassid(){
        return classid;
    }

    void older(int classid1,int classid2){
        if(classid1<classid2){
            System.out.println(name+"在Java前面");
        }else {
            System.out.println(name+"在Java后面");
        }
    }

