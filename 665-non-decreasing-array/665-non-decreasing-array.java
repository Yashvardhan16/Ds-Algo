class Solution {
    public boolean checkPossibility(int[] A) {
     int count = 0;
            for (int i = 1, prev = A[0]; i < A.length; i++) {
                if (prev > A[i]) {
                    if (count++ > 0)
                        return false;
                    if (i - 2 >= 0 && A[i - 2] > A[i])
                        continue;
                }
                prev = A[i];
            }
            return true;
        
    }
}