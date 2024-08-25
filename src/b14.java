import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên :");
        int n =sc.nextInt();
        while (n < 1 || n > 99){
            System.out.println("mời bạn nhập lại :");
            n=sc.nextInt();

        }
        System.out.println("bạn đã nhập ="+n);
    }
}
