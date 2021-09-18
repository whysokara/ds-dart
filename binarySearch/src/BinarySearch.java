public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-4,-2,-0,2,4,5,6,8,23,34,45,56,67};
//        int arr[] = {42,32,21,11,10,5,3};
        int target = 11;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    //return thr index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
    return -1;
    }
}
