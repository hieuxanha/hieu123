public class b18_forlong {
    public static void main(String[] args) {
        // trong ngaoi chay 1 lan trong 7 lan
        for (int i = 1; i <= 7; i++) {
            //COT
            for (int j = 1; j <= 7; j++) {
                //HANG
                System.out.print(i + "" + j + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 7 || j == 1 || j == 7)
                    System.out.print(i + "" + j + "\t");
                else System.out.print(" " + "\t");
            }
            System.out.println("");

        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
       // hinh tam giac can
        int n=7;
        int kt =7*2-2;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=kt;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i*2-1;j++){
                System.out.print(i+""+j+"  ");
            }
            kt -=2;
            System.out.println(" ");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");

        int n1=7;
        int kt1=0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=kt1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(i+""+j+"  ");
            }
            kt1+=2;
            System.out.println(" ");
        }
    }
}
