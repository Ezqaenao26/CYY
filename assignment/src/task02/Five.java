package task02;
//猜大小

import java.util.Scanner;

public class Five { public static void main(String[] args) {
    int x =1+ (int) (Math.random() * 10);
    System.out.println("请输入一个1-10之间的数");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    while(a!=x){
        if (a < x) {
            System.out.println("太小了");
            System.out.println("请继续猜把：");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            a = b;
        } else if (a > x) {
            System.out.println("太大了");
            System.out.println("请继续猜把：");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            a = b;
        }
    }System.out.println("恭喜你，猜对了！");
}
}
