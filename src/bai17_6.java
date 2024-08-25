import java.util.Scanner;

public class bai17_6 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("nhâp n :");
//        int n =sc.nextInt();
//        int tong=0;
//        for(int i=1;i< n;i++){
//            if(n%i==0){
//                tong+=i;
//
//            }
//        }
//        if(tong==n){
//            System.out.println("số hoàn hoản ");
//        }else{
//            System.out.println("số ko hoàn hoản ");
//        }

      for(int n=1;n<=1000;n++){
          int tong=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                tong+=i;


        }
        if(tong==n){
            System.out.println(n+"số hoàn hoản ");

        }
      }
    }
}
