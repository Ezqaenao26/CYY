package task02;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("请输入三个数:");
        Scanner one=new Scanner(System.in);
        Scanner two=new Scanner(System.in);
        Scanner three=new Scanner(System.in);
        int x=one.nextInt();
        int y=two.nextInt();
        int d=three.nextInt();
        if(x>y&&x>d){
            System.out.println(x);
        }else{
            if(y>d){
                System.out.println(y);
            }else{
                System.out.println(d);
            }
        }
    }

}