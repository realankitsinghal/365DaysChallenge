class Solution{
    static int minValue(String s, int k){
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(char ch: map.keySet()){
            pq.add(map.get(ch));
        }
        
        while(pq.size() > 0 && k > 0){
            int val = pq.remove();
            val--;
            pq.add(val);
            
            k--;
        }
        
        if(pq.size() == 0){
            return 0;
        }
        
        while(pq.size() > 0){
            ans += Math.pow(pq.remove(), 2);
        }
        
        return ans;
    }
}
