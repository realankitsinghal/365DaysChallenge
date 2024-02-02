class Solution
{
    int atoi(String s) {
    // Your code here
    boolean neg=false;
    if(s.charAt(0)=='-')neg=true;
    int num=0;
    for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='-' && i==0)continue;
       if(s.charAt(i)>='0' && s.charAt(i)<='9'){
           num*=10;
           num+=(s.charAt(i)-'0');
       }
       else return -1;
     }
     if(neg)return (-1)*num;
     return num;
    }
}