import java.util.Scanner;

public class bai17_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập n : ");
        int n=sc.nextInt();
        int tong=0;
        for(int i=1;i<= n;i++){
            if(i%2 == 1){

            if(i==3)
                continue;
            else
                tong+=i;

            }

        }
        System.out.println("kết quả : "+tong);
    }
}
