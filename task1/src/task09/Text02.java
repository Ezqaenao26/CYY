package task09;

import java.util.Scanner;

/**
 * @author sqh
 */ //输入一个数，求他的位数
public class Text02 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
//       count 保存位数
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
