class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i==0){
                arr.add(0);
                m.put(0,1);
            }else{
                int diff=arr.get(i-1)-i;
                if(diff<0 || m.containsKey(diff)){
                    diff=arr.get(i-1)+i;
                    arr.add(diff);
                }else{
                    arr.add(diff);
                }
                m.put(diff,1);
            }
        }
        return arr;
    }
}