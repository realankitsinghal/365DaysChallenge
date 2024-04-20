class Solution{
    public:
vector<int> findUnion(int arr1[], int arr2[], int n, int m)
    {
        vector<int>v;
        for(int i=0;i<n;i++) v.push_back(arr1[i]);
        for(int i=0;i<m;i++) v.push_back(arr2[i]);
        vector<int>v1;
       unordered_map<int,int>map;
       for(auto i:v) map[i]++;
       for(auto i:map){
           if(i.second>=2) v1.push_back(i.first);
           if(i.second==1) v1.push_back(i.first);
       }
       sort(v1.begin(),v1.end());
       return v1;
    }
};