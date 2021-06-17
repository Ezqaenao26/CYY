/**
 * Create by IntelliJ IDEA
 *
 * @author: sqh
 * @date-Time: 2018/3/30 8:34
 * @description:定义数组并初始化，输出
 */
public class task01 {

  public static void main(String[] args) {
    int[] a=new int[5];
    int[] b={1,4,3,5,7};
    a[0]=3;
    a[2]=5;
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+"\t");
    }
    System.out.println();
    for(int i=0;i<b.length;i++){
      System.out.print(b[i]+"\t");
    }
    System.out.println(a);
  }
}
