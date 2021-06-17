package task03;

public class text02 {  public static void main(String[] args) {
    int count=0;
    for(int i=1;i<100;i++){
        if(i%3==0&i%5==0){
            count=count+1;
        }
    }
    int arr[]=new int[count];
    int b=0;
    for(int i=1;i<100;i++){
        if(i%3==0&i%5==0){
            arr[b]=i;
            b++;
        }
    }
    p1(arr);
    System.out.println(count);
}
    private static void p1(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
