package task10;

public class for01 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=1000;i++){
            int a=i%3;
            int b=i%5;
            int c=i%7;
            if(a==2&&b==3&&c==2){
               sum++;
                System.out.println(i);
            }
        }
        System.out.println("个数："+sum);
    }
}
