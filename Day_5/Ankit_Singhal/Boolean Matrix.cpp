class Solution
{
public:
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(vector<vector<int>>& matrix)
    {
        int rows = matrix.size();
        int cols = matrix[0].size();

        // Arrays to track whether a row or column should be set to 1.
        vector<bool> rowFlag(rows, false);
        vector<bool> colFlag(cols, false);

        // Scan the matrix and update the flags.
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (matrix[i][j] == 1)
                {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // Update the matrix based on the flags.
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (rowFlag[i] || colFlag[j])
                {
                    matrix[i][j] = 1;
                }
            }
        }
    }
};
