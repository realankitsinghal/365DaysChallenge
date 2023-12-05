class Solution {
    public int numberOfMatches(int n) {
        int teams=n, matches = -1, teams_advance = n;
        int ans = 0;
        while(teams_advance>1){
            if(teams%2==0){
                matches = teams/2;
                ans+=matches;
                teams_advance = matches;
                teams = teams_advance;
            }else{
                matches = (teams-1)/2;
                ans+=matches; 
                teams_advance = matches+1;
                teams = teams_advance;
            }
        }
        return ans;
    }
}