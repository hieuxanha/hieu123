import java.sql.SQLOutput;
import java.util.Scanner;

public class xuatnhap {
    public static void main(String[] args) {
        // khoi tao doi tuong
        Scanner sc = new Scanner(System.in);
        //String mk1 = sc.nextLine();
        //khoi tạo đối tượng riieeng
        //Float cao = new Scanner(System.in).nextFloat();

        System.out.println("Mời nhập vào mk cấp 1:");
        String mk1 = sc.nextLine();
        System.out.println("mk cấp 1: "+mk1);

        System.out.println("Mời nhập vào số nguyên :");
        int a = sc.nextInt();
        System.out.println("a= "+a);

        System.out.println("Mời nhập vào 1 số thực : ");
        float x = sc.nextFloat();
        System.out.println("x= "+x );

        // nhập chuỗi
        System.out.println("Mời nhập mk cấp 2:");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("tên cụ là :"+ten);

        System.out.println("Mời cụ nhập giới tích :");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("giới tính củ cụ :"+gt);

        System.out.println("Mời cụ nhập vào chiều cao :");
        float cao = new Scanner(System.in).nextFloat();







    }
}
