public class bai17_5 {
    public static void main(String[] args) {
        int tong=1;
        int m=1;
        for(int i=1;i<=10;i++){
            m*=i;
            System.out.println(m);
            tong+=m;
        }
        System.out.println(tong);
    }
}
