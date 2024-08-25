import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("mời nhập vào 1 số :");
//        int a = sc.nextInt();
//
//        switch (a) {
//            case 1:
//            case 3:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("ngày có 31 ngày !");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("tháng có 30 ngày ");
//                break;
//            case 2:
//                System.out.println("tháng có 28 hoặc 29 ngày");
//                break;
//            default:
//                System.out.println("nhập lại!");
//                break;
        System.out.println("mời nhập số để chọn :");
        System.out.println("1. Tìm theo tên ");
        System.out.println("2. tìm theo tác giả ");
        System.out.println("3.tìm theo nhà xuất bản ");
        System.out.println("4.tìm theo tieu đề ");
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("1. Tìm theo tên ");
                break;
            case 2:
                System.out.println("2. tìm theo tác giả ");
                break;
            case 3:
                System.out.println("3.tìm theo nhà xuất bản ");
                break;
            case 4:
                System.out.println("4.tìm theo tieu đề ");
            default :
                System.out.println("nhập laij !");
                break;



        }
    }
}
