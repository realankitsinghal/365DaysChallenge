class RandomizedSet {
    HashMap<Integer, Integer> valToInd;
    List<Integer> list;
    int ind = 0;
    public RandomizedSet() {
        valToInd = new HashMap<>();
        list = new ArrayList<>();
    }
    public boolean insert(int val) {
        if(valToInd.containsKey(val)) return false;
        list.add(val);
        valToInd.put(val,list.size()-1);
        return true;
    }
    public boolean remove(int val) {
        int ind = valToInd.getOrDefault(val,-1);
        if(ind == -1) return false;
        Collections.swap(list,ind,list.size()-1);
        int swappedWith = list.get(ind);
        valToInd.put(swappedWith,ind);
        list.remove(list.size()-1);
        valToInd.remove(val);
        return true;
    }
    public int getRandom() {
        int max = list.size();
        int min = 0;
        int ind = (int)(Math.random() * (max - min) + min);
        return list.get(ind);
    }
}