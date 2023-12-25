class Solution
{   
    public:
    
    int determinantOfMatrix(vector<vector<int> > matrix, int n){
        // code here 
        if(n == 1)
            return matrix[0][0];
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            vector<vector<int>> sub;
            for(int j = 1; j < n; j++)
            {
                vector<int> temp;
                for(int k = 0; k < i; k++)
                    temp.push_back(matrix[j][k]);
                for(int k = i + 1; k < n; k++)
                    temp.push_back(matrix[j][k]);
                sub.push_back(temp);
            }
            int k = determinantOfMatrix(sub, n - 1);
            ans += k * matrix[0][i] * (pow(-1, i));
        }
        return ans;
    }
    
};