package myPractice;

class RotateArray {

    void reverseArray(int[] nums, int st, int en) {
        while (st < en) {
            int temp = nums[st];
            nums[st] = nums[en];
            nums[en] = temp;
            st++;
            en--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;


        reverseArray(nums, 0, n - k - 1);


        reverseArray(nums, n - k, n - 1);


        reverseArray(nums, 0, n - 1);
    }
}

