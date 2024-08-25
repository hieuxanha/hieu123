import java.util.Scanner;

public class tinhchuvidientich {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp vào bán kính ;");
        double r = sc.nextDouble();
        // vs khoi tạo rieng
        // double r = new Scannner(System.in).nextDouble();

        double cv = 2*Math.PI*r;
        double dt= Math.PI*Math.pow(r,2);

        System.out.println("chu vi :"+cv);
        System.out.println("điện tích :"+dt);
    }
}
