import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入行数：");
        int row=in.nextInt();
        for(int i = 0; i<=row; i++){
            for(int j=0;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
