class Solution {
    public  boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> x=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            x.put(arr[i], x.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> y=new HashSet<>();
        for(int z:x.values())
        {
            if(y.contains(z))
                return false;

            y.add(z);
        }
        return true;
    }
}