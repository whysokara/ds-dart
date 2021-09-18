public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{3,6,7},{6,3,8},{4,5,6}};

        System.out.println( maximumWealth(arr));
    }
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}
