import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Step 1: Build using 2D int array
        int[][] triangle = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Step 2: Convert 2D array to List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int val : triangle[i]) {
                row.add(val);
            }
            result.add(row);
        }

        return result;
    }
}
