package task09;
//求水仙花数100-999
public class Text03 {
    public static void main(String[] args) {

        for ( int i = 100;i >= 100 & i <= 999; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i + "是水仙花数");
            }

        }
    }
}
