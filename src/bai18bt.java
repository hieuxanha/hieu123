public class bai18bt {
    public static void main(String[] args) {
        // CHU N
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(j==1 || j==7 || i==j)
                    System.out.print(i+""+j+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }












    }
}
