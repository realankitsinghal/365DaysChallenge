class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[][]meetings=new int[N][3];
        for(int i=0;i<N;i++){
            meetings[i][0]=S[i];
            meetings[i][1]=F[i];
            meetings[i][2]=i+1;
        }
        Arrays.sort(meetings,(a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        int lastfinish=-1;
        for(int i=0;i<N;i++){
            if(meetings[i][0]>lastfinish){
                  ans.add(meetings[i][2]);
                  lastfinish=meetings[i][1];
              }
        }
        Collections.sort(ans);
        return ans;
    }
}