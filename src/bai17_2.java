import java.util.Scanner;

public class bai17_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("nhập a : ");
        int a=sc.nextInt();

        if(a%2==0){
            int sum=0;
            for(int i=0;i<=a;i++){
               sum+=i;
            }
            System.out.println("tong= "+sum);
        }else {
            System.out.println("tôi o tính tổng lẻ , bye bye ");
        }

    }
}
