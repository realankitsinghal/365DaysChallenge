class Solution
{
    public:
    int activitySelection(vector<int> s, vector<int> e, int n){
        vector<array<int, 2>> v;
        for(int i=0; i<n; i++){
            v.push_back({s[i], e[i]});
        }
        sort(begin(v), end(v), [&](const auto&a, const auto&b){
            return a[1] < b[1]; 
        });
        int count = 0, prev_end = -1;
        for(int i=0; i<v.size(); i++){
            if(prev_end < v[i][0]) count++, prev_end = v[i][1];
        }
        return count;
    }
};