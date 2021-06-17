package task02;

import java.util.Scanner;

//体质转化
public class Four {
    public static void main(String[] args) {
        System.out.println("请输入身高:");
        Scanner hight=new Scanner(System.in);
        System.out.println("请输入体重:");
        Scanner weight=new Scanner(System.in);
        double x=hight.nextDouble();
        double y=weight.nextDouble();
        double BMI;
        BMI=y/(x*x);
        System.out.println(String.format("%.2f", BMI));
        if(BMI<18.5){
            System.out.println(" 过轻");
        }else {
            if(BMI>=18.5&&BMI<=23.9){
                System.out.println(" 正常");
            }else{
                if(BMI>=24&&BMI<=27){
                    System.out.println(" 过重");
                }else{
                    if(BMI>=28&&BMI<=32){
                        System.out.println(" 肥胖");
                    }else{
                        System.out.println("非常肥胖");
                    }
                }
            }
        }


    }
}
