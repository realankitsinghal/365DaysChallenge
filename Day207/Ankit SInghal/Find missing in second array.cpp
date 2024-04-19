class Solution{
       
    public:
    vector<int> findMissing(int a[], int b[], int n, int m) 
    { 
        // Your code goes here
        vector<int> ans;
        unordered_map<int,int> mpp;
        
        for(int i=0;i<m;i++){
            mpp[b[i]]++;
        }
        
        for(int i=0;i<n;i++){
            int num = a[i];
            if(mpp.find(num) == mpp.end()){
                ans.push_back(num);
            }
        }
        
        return ans;
    } 
};