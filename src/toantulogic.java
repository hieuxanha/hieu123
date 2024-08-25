public class toantulogic {
    public static void main(String[] args) {
        int i=15;
        System.out.println(i>0 && i<10);
        System.out.println(i >10 || i <-1);
        System.out.println (!(i>10|| i <-1));
        int x=100;
        int y=90;
        int z=80;
        int t=70;
        x++;
        ++y;
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
         int a=1;
         int b=2;
         //a++ chay sau ++b chay trc;
         int c = a++ - ++b + 1;
         // step 1 ++b -> 3;
        //step 2 a=1,b=3 ->1 - -3+1=-1;
        //step 3 c=-1;
        //step 4 a=2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
