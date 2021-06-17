package task03;

public class text03 {    public static void main(String[] args) {
    int[] a = {20, 10, 0, 24, 78, 53, 0, 60};
    int i=0;
    for(int b=0;b<8;b++){
        if(a[b]!=0){
            i++;
        }
    }
    int [] c=new int[i];
    int d=0;
    for(int b=0;b<8;b++){
        if(a[b]!=0){
            c[d]=a[b];
            d++;
        }
    }
    p1(c);
}
    private static void p1(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}
