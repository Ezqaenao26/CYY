package task11;

import java.util.Scanner;

//输出直角三角形
public class task11_01 {
    public static void main(String[] args) {
        System.out.println("请输入一个行数");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
