class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> x= new HashMap<>();
        for(int y:nums){
            x.put(y,x.getOrDefault(y,0)+1);
        }

        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i:x.values()){
            max=Math.max(max,i);
        }

        for(int z: x.values()){
            if(z==max){
                c+=max;
            }

        }
        return c;

    }
}