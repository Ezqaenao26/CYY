public class Phone {

        private String name;
        private float money;
        private String color;
       void setName(String name1){
           name=name1;
       }
       String getName(){
           return name;
       }
       void setMoney(float money1){
           money=money1;
       }
       void setColor(String color1){
           color=color1;
       }
       String getColor(){
           return  color;
       }



        void play(){
        System.out.println("游戏");
    }
       void study(){
           System.out.println("学习");
       }
       void liaotian(){
           System.out.println("qq");
       }

    }
