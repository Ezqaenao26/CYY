import java.util.Scanner;

public class Text02 {
    public static void main(String[] args) {
        System.out.println("请输入两个数：");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int result = max(num1, num2);
        System.out.println("最大值是：" + result);
    }

    private static int max(int num1, int num2) {
                      int max=num1>num2?num1:num2;
                      return  max;
    }
}