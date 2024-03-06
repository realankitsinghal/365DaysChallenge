class Solution{
    ArrayList<Integer> search(String pattern, String text){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= text.length()-pattern.length() ; i++){
            int k =0;
            while(k < pattern.length() && text.charAt(k+i) == pattern.charAt(k)){
                k++;
            }
            if(k == pattern.length()){
                list.add(i+1);
            }
        }
        return list;
    }
}