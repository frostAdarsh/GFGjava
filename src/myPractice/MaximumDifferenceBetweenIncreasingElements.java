package myPractice;

public class MaximumDifferenceBetweenIncreasingElements {

    class Solution {
        public int maximumDifference(int[] nums) {
            int max = -1;
            int n = nums.length;
            int p = nums[0];

            for(int j=1;j<n;j++){
                if(nums[j]>p){
                    max = Math.max(max,nums[j]-p);
                }else{
                    p = nums[j];
                }
            }
            return max;
        }
    }
}
