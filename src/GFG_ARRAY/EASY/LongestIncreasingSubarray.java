package GFG_ARRAY.EASY;

import java.util.List;

public class LongestIncreasingSubarray {

    public int lenOfLongIncSubArr(List<Integer> arr) {
        if (arr == null || arr.size() == 0) return 0;

        int maxLen = 1, currLen = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }

}
