import java.util.Scanner;

public class bai17_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n : ");
        int n=sc.nextInt();
        int tong=1;
        for(int i=1;i<=n;i++){
            tong*=i;
        }
        System.out.printf("kết quả "+n+"! = %d ",+tong);


    }
}
