import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SortedMap;

public class bai22 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);


        // get năm ,tháng ngày
//    int nam =cal.get(Calendar.YEAR);
//    int thang =cal.get(Calendar.MONTH);
//    int ngay = cal.get(Calendar.DAY_OF_MONTH);

//        System.out.println("năm hiện tại : "+nam);
//        System.out.println("tháng hiện tại : "+(thang+1));
//        // chú tháng luôn chạy 0-11 (nên phải +thêm 1);
//        System.out.println("ngày hiện tại "+ngay);
       // theo ý muốn
//       cal.set(Calendar.YEAR,2004);
//       cal.set(Calendar.MONTH,9);
//       cal.set(Calendar.DAY_OF_MONTH,7);
//
//
        int namsinh=cal.get(Calendar.YEAR);
        int thangsinh=cal.get(Calendar.MONTH);
        int ngaysinh=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngày tháng năm sinh "
        +ngaysinh+"/"+(thangsinh+1)+"/"+namsinh);
//
//        SimpleDateFormat dingdang=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
//        Date d = cal.getTime();
//        String s=dingdang.format(d);
//        System.out.println(s);

    }
}
