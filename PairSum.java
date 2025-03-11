package Arrays;


import java.util.*;
public class PairSum {
    public static List<Integer> pairSum(List<Integer> nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }

        return ans;  // Return an empty list if no pair is found
    }}

