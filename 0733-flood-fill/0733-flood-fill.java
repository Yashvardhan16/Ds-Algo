class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
       if(image[sr][sc]==color) return image;
        helper(image,sr,sc,image[sr][sc],color);
        return image;
    }
    void helper(int[][] image,int sr,int sc,int target,int color){
        if(sr<0||sc<0||sr>image.length-1||sc>image[0].length-1||image[sr][sc]!=target) return;
        image[sr][sc] = color;
        helper(image,sr-1,sc,target,color);
        helper(image,sr+1,sc,target,color);
        helper(image,sr,sc-1,target,color);
        helper(image,sr,sc+1,target,color);
    }
}