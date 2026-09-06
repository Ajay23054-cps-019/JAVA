public class two_dimensional_array {
    public static void main(String[] args){
        int nums[][] = new int[3][4];
        for(int n = 0;n < 3;n++){
            for(int m = 0;m < 4;m++){
                nums[n][m] = (int)(Math.random() * 10);
            }
        }
        //printing the array
        for(int n = 0;n < 3;n++){
            for(int m = 0;m < 4;m++){
                System.out.print(nums[n][m]+" ");
            }
            System.out.println();
        }

        //enhanced loop
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
