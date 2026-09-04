public record logical_ops() {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int i = 3;
        int j = 8;
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>b && i>j); //and operation
        System.out.println(a>b || i>j); //or operation
        boolean res = a>b;
        System.out.println(!res); //not operation
    }
}
