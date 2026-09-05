public class nested_while {
    public static void main(){
        int i = 1;
        while (i<=5) {
            System.out.println("Hello" + i);
            int j = 1;
            while (j<=5) {
                System.out.println("Hi"+j);
                j++;
            }
            i++;
        }
    }
}
