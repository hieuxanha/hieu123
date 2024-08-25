import java.util.Scanner;

public class opp{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tháng : ");
        int thang=sc.nextInt();
        if(thang==1 || thang==3 || thang== 5 || thang ==7|| thang==8 ||thang==10||thang==12){
            System.out.println("Tháng "+thang+ " có 31 ngày");
        }else if(thang==4||thang==6||thang==9||thang==11){
            System.out.println("tháng "+thang+ "có 30 ngày");
        }else if(thang==2){
            System.out.println("nhập nam nhuận : ");
            int nam = sc.nextInt();
            if(((nam%4==0)&&(nam%100!=0))||(nam %400==0)){
                System.out.println("năm nhuận có 28 ngày");
            }else{
                System.out.println("năm ko nhuận có 28 ngày");
            }
        }
        System.out.println("vui lòng nhập laji !");
    }
}