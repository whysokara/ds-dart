public class FIndMin {
    public static void main(String[] args) {
        int[] arr= {2, 1, 3, -5, 3};
        System.out.println( minNumber(arr));
    }

    static int minNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min; }
}
