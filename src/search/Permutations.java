package search;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[n];
        dfs(result, new ArrayList<Integer>(), used, nums);
        return result;

    }

    private void dfs(List<List<Integer>> result, List<Integer> curr, boolean[] used, int[] nums) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                curr.add(nums[i]);
                dfs(result, curr, used, nums);
                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }
}
