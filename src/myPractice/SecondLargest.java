package myPractice;

public class SecondLargest {
    class Solution {
        public int getSecondLargest(int[] arr) {
            if (arr == null || arr.length < 2) {
                return -1;
            }

            int Flargest = arr[0];
            int Slargest = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > Flargest) {
                    Slargest = Flargest;
                    Flargest = arr[i];
                } else if (arr[i] < Flargest && arr[i] > Slargest) {
                    Slargest = arr[i];
                }
            }


            if (Slargest == Integer.MIN_VALUE) {
                return -1;
            }

            return Slargest;
        }
    }
}
