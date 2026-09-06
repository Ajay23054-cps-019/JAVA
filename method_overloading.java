class cal{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,int b){
        return a+b;
    }
}




public class method_overloading {
    public static void main(String[] args) {
        cal obj = new cal();
        System.out.println(obj.add(5, 6,7));
        System.out.println(obj.add(4,5));
        System.out.println(obj.add(3.4565,6));
    }
}
