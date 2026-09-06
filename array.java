public class array {
    public static void main(){
        int arr[] = {2,4,6,7};
        int arr1[] = new int[4];

        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        for(int i=0;i<=3;i++){
            System.out.println(arr[i]+arr1[i]);
        }
    }
}
