package task07;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner num=new Scanner(System.in);
        int x=num.nextInt();
        int y;
        if(x>=3){
            y=2*x+1;
            System.out.println("y="+y);
        }else if(x>=-1&&x<3){
            y=2*x;
            System.out.println("y="+y);
        }else if(x<-1){
            y=2*x-1;
            System.out.println("y="+y);
        }

    }
}
