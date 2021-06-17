package task10;

import java.util.Scanner;

public class for02 {
    public static void main(String[] args){
        System.out.println("请输入一个数：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
            result=result*1;
        }
        System.out.println(result);
    }
}
