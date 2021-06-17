package task03;

import java.util.Random;
import java.util.Scanner;

public class text01 {
        private static void add(String[] student) {
            Scanner scanner = new Scanner(System.in);
            for(int i=0;i<student.length;i++){
                System.out.println("储存第"+(i+1)+"个学生名字：");
                student[i]=scanner.next();
            }
        }
        private static void print(String[] students){
            for(int i=0;i<students.length;i++){
                String name=students[i];
                System.out.println("第"+(i+1)+"个学生名字："+name);
            }
        }
        private static String random(String[] students){
            int index=new Random().nextInt(students.length);
            String name=students[index];
            return name;
        }
        public static void main(String[] args){
            System.out.println("-----随机点名器-----");
            String[] students=new String[3];
            add(students);
            print(students);
            String random=random(students);
            System.out.println("被点到名的同学是："+random);
        }
    }

}
