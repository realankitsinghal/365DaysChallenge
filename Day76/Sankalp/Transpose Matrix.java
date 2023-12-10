import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> transpose(List<List<Integer>> matrix) {
        int n = matrix.size();
        int m = matrix.get(0).size();

        List<List<Integer>> ans = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(matrix.get(i).get(j));
            }
            ans.add(temp);
        }

        return ans;
    }
}