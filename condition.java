public class condition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>b && a>c){ //no need for {} if statement is lessthan 1 line
            System.out.println(a);
        }else if (b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

        //Ternary operator using ?:
        System.out.println(a>b?a:b);
    }

}
