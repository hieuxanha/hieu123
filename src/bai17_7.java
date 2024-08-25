import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class bai17_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp vào 1 số nguyên ");
        int a=sc.nextInt();
        while(a<=0){
            System.out.println("nhập lại a , a phai > 0");
            a=sc.nextInt();
        }
        int demuoc=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                demuoc++;
            }
        }
        if(demuoc==2){
            System.out.println(a+"là số nguyên tố");
         }else{
            System.out.println(a+"ko là số nguyên tố ");
        }
    }

}
