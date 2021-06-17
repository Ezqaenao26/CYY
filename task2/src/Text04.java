import java.util.Scanner;
//星星2

public class Text04 {
    public static void main(String[] args) {
        System.out.println("请输入几行几列：");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j=1;j<=num2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
