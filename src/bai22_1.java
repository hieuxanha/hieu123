import java.util.Calendar;
import java.util.Scanner;

public class bai22_1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
       int day,month,tuoi,year;
        System.out.println(" moiwf nhập ngày sinh :");
        day=sc.nextInt();
        System.out.println("moi nhap vao ngay sinh ");
        month=sc.nextInt();
        System.out.println("moi nhap vao năm sinh ");
        year=sc.nextInt();

        Calendar abc=Calendar.getInstance();

        abc.set(year,month-1,day);

        int namsinh=abc.get(Calendar.YEAR);
        int thangsinh=abc.get(Calendar.MONTH);


    }

}
