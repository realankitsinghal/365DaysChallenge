class Solution
{
    public static boolean isPrime(int n) {
        if (n <= 1) {
          return false;
        }
        for (int i = 2; i < n; i++) {
          if (n % i == 0) {
            return false;
          }
        }
        return true;
    }
    public int minNumber(int arr[], int N)
    {
        int sum = 0, pNum = 0;
        for(int i=0; i<N; i++){
            sum+=arr[i];
        }
        pNum = sum;
        while(isPrime(pNum)!=true){
            pNum++;
        }
        return pNum-sum;
    }
}