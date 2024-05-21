class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> p= new ArrayList<>();
        p.add(new ArrayList<>());//[]
        for(int x: nums)
        {
            int n1=p.size();
            for(int i=0;i<n1;i++)
            {
                List<Integer> t =new ArrayList<>(p.get(i));
                t.add(x);
                p.add(t);
            }
        }
        for(int i=0;i<p.size();i++)
            System.out.println(p.get(i));
        return p;
    }
}