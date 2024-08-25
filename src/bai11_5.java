import java.util.Scanner;

public class bai11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a :");
        int a = sc.nextInt();
        System.out.println("nhâp b :");
        int b = sc.nextInt();
        System.out.println("nhập c :");
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("pt vô nghiệm !");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("pt có nghiệm kép x1 = x2 =" + x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (b + Math.sqrt(delta) / (2 * a));
            System.out.println("phương trình có 2 nghiệm phân biệt ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }

    }
}
