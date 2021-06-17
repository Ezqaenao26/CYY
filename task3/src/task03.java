/**
 * Create by IntelliJ IDEA
 *
 * @author: sqg
 * @date-Time: 2018/3/30 11:38
 * @description:二维数组
 */
public class task03 {

  public static void main(String[] args) {
    int[][] arr=new int[2][3];
    arr[0][2]=5;
    for(int i=0;i<arr.length;i++){
      for (int k=0;k<arr[i].length;k++){
        System.out.print(arr[i][k]+"\t");
      }
      System.out.println();
    }
    int[][] arr5={
        {22,66,44},
        {77,33,88},
        {25,45,65},
        {11,66,99}
    };
  }

}
