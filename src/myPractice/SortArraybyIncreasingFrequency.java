//package myPractice;
//
//
//    class Solution {
//        public int[] frequencySort(int[] nums) {
//
//            HashMap<Integer, Integer> freq = new HashMap<>();
//            for (int num : nums) {
//                freq.put(num, freq.getOrDefault(num, 0) + 1);
//            }
//
//            Integer[] temp = new Integer[freq.size()];
//            int idx = 0;
//            for (Integer key : freq.keySet()) {
//                temp[idx++] = key;
//            }
//
//            Arrays.sort(temp, new Comparator<Integer>() {
//                public int compare(Integer a, Integer b) {
//                    if (freq.get(a).equals(freq.get(b))) {
//                        return b - a;
//                    }
//                    return freq.get(a) - freq.get(b);
//                }
//            });
//
//            idx = 0;
//            for (Integer key : temp) {
//                int f = freq.get(key);
//                for (int j = 0; j < f; j++) {
//                    nums[idx++] = key;
//                }
//            }
//
//            return nums;
//        }
//    }
//
