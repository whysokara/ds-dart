public class evenDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums = {12,345,4576,23,234567};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits2(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    static  int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

//    static int digits(int num){
//        if(num < 0){
//            num = num * -1;
//        }
//        if(num == 0){
//            return 1;
//        }
//        int count = 0;
//        while (num > 0){
//            count++;
//            num = num/10;
//        }
//        return count;
//    }
}
