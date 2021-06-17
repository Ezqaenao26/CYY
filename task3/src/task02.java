/**
 * Create by IntelliJ IDEA
 *
 * @author:sqh
 * @date-Time: 2018/3/30 10:12
 * @description:输出最大最小值
 */
public class task02 {

  public static void main(String[] args) {
    int[] arr={20,10,45,24,78,53,100,60};
    //调用遍历数组所有元素
    printArry(arr);
    //调用最大值
    int max=mymax(arr);
    System.out.println("数组中最大值是："+max);
  //  调用最小值
    int min=mymin(arr);
    System.out.println("数组中最小值是："+min);
  //  排序
    mysort(arr);

  }

  private static void mysort(int[] arr) {
    int t;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] > arr[j]) {
          t = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = t;
        }
      }
    }
    printArry(arr);
  }

  private static int mymin(int[] arr) {
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }


  private static int mymax(int[] arr) {
    int max=arr[0];
    for(int i=0;i<arr.length;i++) {
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }

  private static void printArry(int[] arr) {
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+"\t");
    }
    System.out.println();
  }
}
