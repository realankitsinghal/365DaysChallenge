class Solution{
    public long sumXOR(int arr[], int n) {
    long totalXOR = 0;
    for (int i = 0; i < 32; i++) {
        int countOnes = 0;
        for (int j = 0; j < n; j++) {
            if ((arr[j] & (1 << i)) != 0) {
                countOnes++;
            }
        }
        totalXOR += (long) (1 << i) * countOnes * (n - countOnes);
    }
    return totalXOR;
    }
}