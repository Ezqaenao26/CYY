package task07;

import java.util.Scanner;

/**
 * @author sqh
 * 从键盘输入一个数，判断是奇数还是偶数
 */
public class Text1 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
}
