public class maxRange {
    public static void main(String[] args) {
        int[] arr = {1,3,2,45,34,11};
        System.out.println(maxRange(arr, 1 ,3));
    }
    static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
