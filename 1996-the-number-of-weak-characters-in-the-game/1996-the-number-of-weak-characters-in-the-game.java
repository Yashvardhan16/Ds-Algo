class Solution {
    public int numberOfWeakCharacters(int[][] nums) {
 Arrays.sort(nums,(a,b)-> (a[0]==b[0])?a[1]-b[1]:b[0]-a[0])  ;  
     int count =0;
        int current = -1;
        for(int i[]:nums){
           if(i[1]<current) count++;
            else current =i[1];
        }
        return count;
    }
}