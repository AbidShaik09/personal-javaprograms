import java.util.Scanner;
class ThreeD{
    public static void main( String ... args){
        int [][]arr[] = new int[2][2][2];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    arr[i][j][k] = sc.nextInt();

                }

            }
        }
        for(int[][] i : arr){
            for(int[] j : i)
                for( int k:j)
                    System.out.println(k);
        }



    }
}