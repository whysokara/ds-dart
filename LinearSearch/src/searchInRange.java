public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearch(arr,3,0,2));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if(arr[i] == target){
                return i;
            }

        }
        return  -1;
    }
}
