/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/30 9:14
 * @description:
 */
public class text01 {

  public static void main(String[] args) {
    int[] x={4,3,7};
    int[] y=new int[4];
    y[0]=1;
    y[1]=2;
    y[2]=x[2];

    for(int i=0;i<y.length;i++){
      System.out.print(y[i]+"\t");
    }
    System.out.println("\t\t输出y的元素");
    y=x;
    for(int i=0;i<y.length;i++){
        System.out.print(y[i]+"\t");
      }
    System.out.println("\t\ty=x输出y[0]的数值");
    x[0]=10;
    System.out.print(y[0]);
    System.out.println("\t\t输出y[0]的数值");
  }

}
