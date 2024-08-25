public class pheptoan {
    public static void main (String[] args){
        int i1=2;
        int i2=5;
        int i3=-3;
        double d1=2.0;
        double d2=5.0;
        double d3=-0.5;
        double kq = i1 + (i2*i3);
        System.out.println("a= "+kq);


        kq=(float) i2 * (i2 *i3);
        System.out.println("b= "+kq);
        kq = (float)i1 / (i2 + i3);
        System.out.println("c= "+kq);
        kq=(double)i1/i2+i3;
        System.out.println("e= "+kq);

        kq=(double)3+4+5/3;
        System.out.println("g= "+kq);

        kq=(double)(3+4+5)/3;
        System.out.println("i= "+kq);
        kq=(float)d1+(d2*d3);
        System.out.println("k= "+kq);
        kq=(float)(d1+d2*d3);
        System.out.println("l= "+kq);
        kq=(float)d1/d2-d3;
        System.out.println("m= "+kq);
        kq=(float)d1/(d2-d3);
        System.out.println("n= "+kq);
        kq=(float)d1+d2+d3/3;
        System.out.println("o= "+kq);
        kq=(float)(d1+d2+d3)/3;
        System.out.println("p= "+kq);
        kq=(float)d1+d2+(d3/3);
        System.out.println("q= " +kq);
        kq=(double)3*(d1+d2)*(d1-d3);
        System.out.println("r= "+kq);



    }


}
