class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Tích i hiện tại bằng tích bên trái * tích bên phải
        int[] result = new int[n];

        //Xử lí tích trái
        int[] leftProduct = new int[n];
        int currProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProduct[i] = currProduct;
            currProduct *= nums[i];
        }

        //Xử lí tích phải
        int[] rightProduct = new int[n];
        currProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProduct[i] = currProduct;
            currProduct *= nums[i];
        }

        for (int i = 0; i < n; i++)
           result[i] = leftProduct[i] * rightProduct[i];

        return result;

    }
}  
