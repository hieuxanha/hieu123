import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap sô :");
        int x=sc.nextInt();

        int abc=0;
        for(int i=1;i<x;i++){
            abc++;
        }
        System.out.println(abc);
    }

}
