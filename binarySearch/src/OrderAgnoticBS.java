public class OrderAgnoticBS {
    public static void main(String[] args) {
//        int[] arr = {-4,-2,-0,2,4,5,6,8,23,34,45,56,67};
        int arr[] = {42,32,21,11,10,5,3};
        int target = 21;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static  int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find if array is asc or desc
        boolean isAsc = arr[start] < arr[end];


        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
