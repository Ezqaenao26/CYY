package task02;
//整数转化
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner zs=new Scanner(System.in);
        int x=zs.nextInt();
        int fanily=0;
        while(x>0)
        {
            int n=x%10;
            fanily=fanily*10+n;
            x=x/10;
        }
        System.out.println(fanily);
    }
}
