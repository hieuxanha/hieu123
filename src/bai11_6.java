import java.util.Scanner;

public class  bai11_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap tháng dó :");
        int thang=sc.nextInt();
        if(thang==1||thang==2||thang==3){
            System.out.println("Quý 1");
        }else if(thang==4||thang==5||thang==6){
            System.out.println("Quý 2");
        }else if(thang==7||thang==8||thang==9){
            System.out.println("Quý 3");
        }else if(thang==10||thang==11||thang==12){
            System.out.println("Quý 4");

        }else{
            System.out.println("nhap lại hộ bố !!");
        }
    }
}
