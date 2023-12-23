class Solution {
     public int countOccurence(int[] arr, int n, int k) {
        int num = n/k;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> itr : map.entrySet()){
            if(itr.getValue()>num)
                cnt++;
        }
        return cnt;
    }
}