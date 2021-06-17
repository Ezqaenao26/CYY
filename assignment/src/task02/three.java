package task02;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.println("请输入2个数:");
        Scanner one=new Scanner(System.in);
        Scanner two=new Scanner(System.in);
        int x=one.nextInt();
        int y=two.nextInt();
        if(x == y){
            System.out.println("相同");
        }else {
            System.out.println("不相同");
        }
    }
}
