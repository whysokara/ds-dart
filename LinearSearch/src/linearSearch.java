public class linearSearch {
    public static void main(String[] args) {

        int[] num = {1, 2, 45, 32, 34, 67};
        int target = 32;
        int ans = linearSearchFunction(num, target);
        System.out.println(ans);

    }
    static int linearSearchFunction(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return  -1;
    }
}
