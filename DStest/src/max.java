public class max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 23, 56, 7};
        System.out.println(max(arr));
    }
    private static int max(int[] arr){
        if(arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }

        }
        return maxValue;

    }
}
