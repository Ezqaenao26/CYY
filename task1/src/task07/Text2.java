package task07;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        System.out.println("请输入一个成绩：");
        Scanner cj=new Scanner(System.in);
        int x=cj.nextInt();
        switch (x/10){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            default:
                    System.out.println("good");
                    break;

        }


    }
}
