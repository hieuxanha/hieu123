import java.util.Scanner;

public class toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Mời các bạn nhập :");
//        int n=sc.nextInt();
//        String traloi=(n%2==0)?"chẫn ":"lẻ";
//        System.out.println("sô"+n+ "là số "+traloi);
        System.out.println("mời nhập vào :");
        double dtb=sc.nextDouble();
        String traloi=(dtb>10)?"sai nhập lại":
                ((dtb>=8)?"giỏi":
                        (dtb < 8 && dtb <=6.5)?"khá":
                                (dtb < 6.5 && dtb > 5)?"trungbinh":"yếu");
        System.out.println(traloi);




    }
}
