public class task03 {
    public static void main(String[] args) {
        int sum1=add(4,3);
        int sum2=add(4,3,1);
        float sum3=add(1f,4f);
        System.out.println();
    }
    static int add(int m,int n){
        return m+n;
    }
    static float add(float n,float m){
        return m+n;
    }
    static int add(int n,int m,int z){
        return n+m+z;
    }
}
