public class bai20 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try{
            int c=a/b;
            System.out.println("c= "+c);
        }
        //xu le ngoai le
        catch(Exception ex){
            System.out.println(" có lỗi ");
            ex.printStackTrace();
        }
        System.out.println("đoạn code phía sau ");
    }
}
