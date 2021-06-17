package task09;
//输出1到10的偶数和

public class Whlie01 {
    public static void main(String[] args) {
       int i=1;
       int sum=0;
       while (i<=10){
           if(i%2==0){
               sum=sum+i;
           }
           i++;
       }
        System.out.println("一到10的偶数和："+sum);
    }
}
