public class type_conversions {
    public static void main(){
        int a = 555;
        //byte b = a; unable to run due to byte is less than int
        byte b = (byte)a; //assigns a%256
        System.out.println(b);

        byte c = 36;
        int d = c; //can conert directly cus byte is less than int
        System.out.println(d);
    }
}
