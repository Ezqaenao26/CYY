package task02;
//折纸
public class Seven { public static void main(String[] args) {
    double i=0.01;
    int sum=0;
    while(i<=8848){
        i=i*2;
        sum++;
    }
    System.out.println("折叠"+sum+"次");
 }
}
