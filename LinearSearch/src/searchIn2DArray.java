import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,4,5},
                {43,56,3,21},
                {56,43,3,43},
                {4,67,32,21}
        };
        int target = 21;
//        int[] ans = search(arr, target);
        int ans = max(arr);

        System.out.println(ans);
    }
//    static int[] search(int[][] arr, int target){
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] == target){
//                    return new int[] {row, col};
//                }
//            }
//
//        }
//        return new int[] {-1, -1};
//    }

    //max in 2D array
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                   max = arr[row][col];
                }
            }

        }
        return max;
    }
}
