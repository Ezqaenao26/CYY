import java.util.Scanner;

public class Text03 {
    public static void main(String[] args) {
        System.out.println("请输入两个数：");
        Scanner in=new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num=0;
            if(num1>=num2){
            for(int i=0;i>=num2&&i<=num1;i++){
                if(i%2==0)
                num=num+i;
            }

        }else {
            for(int i=0;i<=num2&&i>=num1;i++){
                if(i%2==0)
                num=num+i;
            }
            System.out.println("最大值是："+num);
        }

    }
}
